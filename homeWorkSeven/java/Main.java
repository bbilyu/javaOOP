package homeWorkOne;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBook();
        Controller.start(phoneBook);
    }
}
