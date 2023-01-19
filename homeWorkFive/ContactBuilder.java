package homeWorkFive;

public class ContactBuilder{
    Contact t;
    private static ContactBuilder cb;
    public static ContactBuilder Create() {
        if (cb == null)
            cb = new ContactBuilder();
        cb.t = new Contact();
        return cb;
    }

    private ContactBuilder() {
        t = new Contact();;
    }

    public ContactBuilder setName(String contactName) {
        t.setName(contactName);
        return this;
    }

    public ContactBuilder setSurname(String contactSurname) {
        t.setSurname(contactSurname);
        return this;
    }

    public ContactBuilder setPhoneNumber(long phoneNumber) {
        t.setPhoneNumber(phoneNumber);
        return this;
    }
    public Contact build() {
        return t;
    }

}
