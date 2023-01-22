package homeWorkFour;

import java.util.ArrayList;

public class Chat implements ChatRoom {
    boolean privateStatus;
    ArrayList<User> users;

    ArrayList<User> allowedUsers;
    ArrayList<User> blockUsers;

    public Chat(){
        users = new ArrayList<>();

        allowedUsers = new ArrayList<>();

        blockUsers = new ArrayList<>();
    }

    @Override
    public void sendMessage(String text, User me) {
        for (User user : users) {
            if (user.name != me.name) {
                if (blockUsers.contains(me)) {
                    user.printMessage("\n >>> заблокированный пользователь " + me.name + " пытался отправить сообщение!");
                } else {
                    user.printMessage(text);
                }
            }
        }
    }

    @Override
    public void appendClient(User client) {
        if (privateStatus) {
            if (allowedUsers.contains(client)) {
                System.out.println("\n >>> " + client.name + " присоеденился");
                users.add(client);
            } else {
                System.out.println("\n >>> Пользователю " + client.name + " вход запрещен!");
            }
        } else {
            System.out.println("\n >>> " + client.name + " присоеденился");
            users.add(client);
        }

    }

    @Override
    public void deleteClient(User client) {
        System.out.println("\n >>> " + client.name + " покинул чат");
        users.remove(client);

    }

    @Override
    public void blockClient(User client) {
        System.out.println("\n >>> Пользователь " + client.name + " заблокирован");
        blockUsers.add(client);

    }

    @Override
    public void unlockClient(User client) {
        System.out.println("\n >>> Пользователь " + client.name + " разблокирован");
        blockUsers.remove(client);

    }

    @Override
    public void changeStatusPrivate(boolean trueFalse) {
        this.privateStatus = trueFalse;
    }

    @Override
    public void addAllowedUsers(User... user) {
        for (int i = 0; i < user.length; i++) {
            allowedUsers.add(user[i]);
        }
    }
}
