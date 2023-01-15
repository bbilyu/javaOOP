package homeWorkFive;

import java.nio.channels.CancelledKeyException;

// Класс для создания контакта

public class Contact {
    private String name;
    private String surname;
    private long phoneNum;

    public void setName(String contactName) {
        name = contactName;
    }

    public void setSurname(String contactSurname) {
        surname = contactSurname;
    }

    public void setPhoneNumber(long phoneNumber) {
        phoneNum = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPhoneNumber() {
        return phoneNum;
    }
}
