package homeWorkOne;

import java.io.IOException;

public class Controller {
    public static void start(PhoneBook phoneBook) throws IOException {
        switch (Interface.mainMenu()) {
            case 1:
                Interface.clearConsole();
                phoneBook.addContact(new Contact(Interface.inputName(), Interface.inputSurname(), Interface.inputPhoneNumber()));
                Interface.pressEnter();
                Interface.clearConsole();
                start(phoneBook);
                break;
            case 2:
                switch (Interface.chooseRemoveContact()) {
                    case 1:
                        Interface.clearConsole();
                        phoneBook.removeContact(Interface.contactParametr());
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                    case 2:
                        Interface.clearConsole();
                        phoneBook.removeContact(phoneBook.getContact(Interface.indexContactInList(phoneBook)));
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                }
            case 3:
                Interface.clearConsole();
                phoneBook.changeContact(phoneBook.getContact(Interface.indexContactInList(phoneBook)), Interface.chooseChangeContact());
                Interface.pressEnter();
                Interface.clearConsole();
                start(phoneBook);
            case 4:
                Contact con = new Contact(Interface.inputName(), Interface.inputSurname(), Interface.inputPhoneNumber());
                int index = phoneBook.searchContact(con);
                Interface.clearConsole();
                if (index != -1) {
                    Interface.printContactInList(index, con);
                } else {
                    Interface.contactNotFound();
                }
                Interface.pressEnter();
                Interface.clearConsole();
                start(phoneBook);
            case 5:
                Interface.clearConsole();
                Interface.printAllContacts(phoneBook.getAllContacts());
                Interface.pressEnter();
                Interface.clearConsole();
                start(phoneBook);
            case 6:
                switch (Interface.chooseFormat()) {
                    case 1:
                        Interface.clearConsole();
                        FileOperator.inputContactsHorisontalFormat(Interface.fileName(), phoneBook);
                        Interface.contactSuccessfullyInput();
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                    case 2:
                        Interface.clearConsole();
                        FileOperator.inputContactsVerticalFormat(Interface.fileName(), phoneBook);
                        Interface.contactSuccessfullyInput();
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                }
            case 7:
                switch (Interface.chooseFormat()) {
                    case 1:
                        Interface.clearConsole();
                        FileOperator.extractContactsHorisontalFormat(Interface.fileName(), phoneBook);
                        Interface.contactSuccessfullyExtract();
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                    case 2:
                        Interface.clearConsole();
                        FileOperator.extractContactsVerticalFormat(Interface.fileName(), phoneBook);
                        Interface.contactSuccessfullyExtract();
                        Interface.pressEnter();
                        Interface.clearConsole();
                        start(phoneBook);
                }
            case 8:
                Interface.clearConsole();
                phoneBook.deleteAllContacts();
                Interface.pressEnter();
                Interface.clearConsole();
                start(phoneBook);
            case 9:
                System.exit(1);
        }
    }
}
