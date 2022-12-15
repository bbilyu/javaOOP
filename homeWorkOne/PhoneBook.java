package homeWorkOne;
// Класс для создания телефонной книги
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

public class PhoneBook {
    ArrayList<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public PhoneBook(Contact contact) {
        contacts = new ArrayList<>();
        contacts.add(contact);
    }

    public PhoneBook(ArrayList<Contact> contact) {
        contacts = new ArrayList<>();
        contacts = contact;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void removeContact(String contactParametr) {
        int count = 0;
        int index = -1;
        for (Contact c : contacts) {
            if (c.getName().contains(contactParametr) && c.getName().length() == contactParametr.length()) {
                count++;
            }
            if (c.getSurname().contains(contactParametr) && c.getSurname().length() == contactParametr.length()) {
                count++;
            }
            if (Long.toString(c.getPhoneNumber()).contains(contactParametr) && Long.toString(c.getPhoneNumber()).length() == contactParametr.length()) {
                count++;
            }
        }
        while (count > 1) {
            if (count > 1) {
                Interface.lotsContacts();
                String secondParametr = Interface.contactParametr();
                count = 0;
                for (Contact c : contacts) {
                    boolean firstParametrName = c.getName().contains(contactParametr) && c.getName().length() == contactParametr.length();
                    boolean firstParametrSurname = c.getSurname().contains(contactParametr) && c.getSurname().length() == contactParametr.length();
                    boolean firstParametrPhoneNumer = Long.toString(c.getPhoneNumber()).contains(contactParametr) && Long.toString(c.getPhoneNumber()).length() == contactParametr.length();
                    boolean secondParametrName = c.getName().contains(secondParametr) && c.getName().length() == secondParametr.length();
                    boolean secondParametrSurname = c.getSurname().contains(secondParametr) && c.getSurname().length() == secondParametr.length();
                    boolean secondParametrPhoneNumer = Long.toString(c.getPhoneNumber()).contains(secondParametr) && Long.toString(c.getPhoneNumber()).length() == secondParametr.length();
                    if (firstParametrName && secondParametrSurname) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                    if (firstParametrName && secondParametrPhoneNumer) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                    if (firstParametrSurname && secondParametrName) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                    if (firstParametrSurname && secondParametrPhoneNumer) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                    if (firstParametrPhoneNumer && secondParametrName) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                    if (firstParametrPhoneNumer && secondParametrSurname) {
                        count++;
                        index = contacts.indexOf(c);
                    }
                }
            }
        }

        if (count == 0) {
            Interface.contactNotFound();
        } else {
            contacts.remove(index);
            Interface.contactSuccessfullyDeleted();
        }
    }

    public void changeContact(Contact contact, int parametrNumber) {
        switch (parametrNumber) {
            case 1:
                contact.setName(Interface.inputName());
                break;
            case 2:
                contact.setSurname(Interface.inputSurname());
                break;
            case 3:
                contact.setPhoneNumber(Interface.inputPhoneNumber());
                break;
        }
    }

    public int searchContact(Contact contact) {
        int index = -1;
        for (Contact c : contacts) {
            if (c.getName().contains(contact.getName()) && c.getName().length() == contact.getName().length() && c.getSurname().contains(contact.getSurname()) && c.getSurname().length() == contact.getSurname().length() && Long.toString(c.getPhoneNumber()).contains(Long.toString(contact.getPhoneNumber())) && Long.toString(c.getPhoneNumber()).length() == Long.toString(contact.getPhoneNumber()).length()) {
                index = contacts.indexOf(c);
                break;
            }
        }
        return index;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public void deleteAllContacts() {
        contacts = new ArrayList<>();
    }

}
