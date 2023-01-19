package homeWorkFour;

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

