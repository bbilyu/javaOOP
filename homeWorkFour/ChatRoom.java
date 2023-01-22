package homeWorkFour;

public interface ChatRoom {

    void sendMessage(String msg, User user);

    void appendClient(User user);

    void deleteClient(User user);

    void blockClient(User user);

    void unlockClient(User user);

    void changeStatusPrivate(boolean trueFalse);

    void addAllowedUsers(User... user);

}
