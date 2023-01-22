package homeWorkFour;

public class User {
    String name;
    private ChatRoom chatroom;

    public User(String name, ChatRoom chatroom) {
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
