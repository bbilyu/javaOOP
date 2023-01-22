package homeWorkOne;
// Класс для создания контакта
public class Contact {
    String name;
    String surname;
    long phoneNum;

    public Contact(String contactName, String contactSurname, long phoneNumber) {
        name = contactName;
        surname = contactSurname;
        phoneNum = phoneNumber;
    }

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