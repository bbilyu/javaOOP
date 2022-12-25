package homeWorkFour;

import java.util.ArrayList;

public class Pro {

    public static void main(String[] args) {
        Chat gb = new Chat();

        gb.changeStatusPrivate(true);

        User client1 = new User("Коля", gb);
        User client2 = new User("Вася", gb);
        User client3 = new User("Петя", gb);
        User client4 = new User("Никита", gb);

        gb.addAllowedUsers(client1, client2, client3);

        gb.appendClient(client1);
        gb.appendClient(client2);
        gb.appendClient(client3);
        gb.appendClient(client4);

        client1.sendMsg("Привет!");

        client2.sendMsg("Ку-ку!");

        User client5 = new User("Дима", gb);

        gb.addAllowedUsers(client5);

        gb.appendClient(client5);

        gb.blockClient(client5);

        client5.sendMsg("hello world!");

        gb.deleteClient(client5);

        client3.changeName("Саша");
    }
}

class User {
    String name;
    private Chatroom chatroom;

    public User(String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    void printMessage(String msg) {
        System.out.printf("Чат %s: %s\n", name, msg);
    }

    void changeName(String name) {
        this.name = name;
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }
}

interface Chatroom {
    void sendMessage(String msg, User user);

    void appendClient(User user);

    void deleteClient(User user);

    void blockClient(User user);

    void unlockClient(User user);

    void changeStatusPrivate(boolean trueFalse);

    void addAllowedUsers(User... user);
}

class Chat implements Chatroom {

    boolean privateStatus;
    ArrayList<User> users = new ArrayList<>();

    ArrayList<User> allowedUsers = new ArrayList<>();
    ArrayList<User> blockUsers = new ArrayList<>();

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