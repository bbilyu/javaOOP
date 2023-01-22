package homeWorkOne;
//Пользовательский интерфейс
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    public static int mainMenu() {
        Scanner console = new Scanner(System.in);
        System.out.println("Меню выбора: \n" +
                "1 - Добавить контакт\n" +
                "2 - Удалить контакт\n" +
                "3 - Изменить контакт\n" +
                "4 - Поиск контакта\n" +
                "5 - Показать все контакты\n" +
                "6 - Импортировать телефонный справочник\n" +
                "7 - Экспортировать телефонный справочник \n" +
                "8 - Отчистить телефонный справочник \n" +
                "9 - Выход\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }

    public static int chooseRemoveContact() {
        Interface.clearConsole();
        Scanner console = new Scanner(System.in);
        System.out.println("Удаление контакта: \n" +
                "1 - По параметру (Имя/Фамилия/Телефон)\n" +
                "2 - По контакту из списка\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }

    public static int chooseChangeContact() {
        Scanner console = new Scanner(System.in);
        System.out.println("Изменение контакта: \n" +
                "1 - Изменить имя\n" +
                "2 - Изменить фамилию\n" +
                "2 - Изменить номер телефона\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }

    public static int chooseFormat() {
        Scanner console = new Scanner(System.in);
        System.out.println("В каком формате: \n" +
                "1 - Горизонатльный\n" +
                "2 - Вертикальный\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }

    public static boolean fileNotFound() {
        Interface.clearConsole();
        Scanner console = new Scanner(System.in);
        System.out.println("Ошибка файл не найден! Создать файл?: \n" +
                "1 - Да\n" +
                "2 - Нет\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n == 1 ? true : false;
    }

    public static void contactNotFound() {
        System.out.println("Ошибка! Контакт не найден!");
    }

    public static void printContactInList(long index, Contact contact) {
        System.out.println("Контакт найден!");
        System.out.println(String.format("%d. %s %s %s", index + 1, contact.getName(), contact.getSurname(), contact.getPhoneNumber()));
    }

    public static void printAllContacts(ArrayList<Contact> contacts) {
        System.out.println("Список контактов:");
        if (contacts.toArray().length == 0) {
            System.out.println("Список контактов пуст");
        } else {
            for (Contact contact : contacts) {
                System.out.println(String.format("%d. %s %s %d", contacts.indexOf(contact) + 1, contact.getName(), contact.getSurname(), contact.getPhoneNumber()));
            }
        }
    }

    public static String inputName() {
        System.out.println("Введите Имя: ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextLong()) {
            System.out.println("Пожалуйста введите текст!");
            console.nextLine();
        }
        return console.nextLine();
    }

    public static String inputSurname() {
        System.out.println("Введите Фамилию: ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextLong()) {
            System.out.println("Пожалуйста введите текст!");
            console.nextLine();
        }
        return console.nextLine();
    }

    public static long inputPhoneNumber() {
        System.out.println("Введите Номер телефона: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextLong()) {
            System.out.println("Пожалуйста введите номер в числовом формате!");
            console.next();
        }
        return console.nextLong();
    }

    public static String fileName() {
        System.out.println("Введите имя файла `example.txt`: ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextLong()) {
            System.out.println("Пожалуйста введите текст!");
            console.next();
        }
        return console.nextLine();
    }

    public static String contactParametr() {
        System.out.println("Введите параметр: ");
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static void lotsContacts() {
        System.out.println("Ошибка! Найдено много контактов, пожалуйста добавте еще один параметр!");
    }

    public static int indexContactInList(PhoneBook book) {
        printAllContacts(book.getAllContacts());
        System.out.println("Выберите контакт: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        return console.nextInt() - 1;
    }

    public static void clearConsole() {
        for (int clear = 0; clear < 500; clear++) {
            System.out.println("\b");
        }
    }

    public static void pressEnter() {
        System.out.println();
        System.out.println("Нажмити \"ENTER\" для продолжения...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void contactSuccessfullyDeleted() {
        System.out.println("Контакт успешно удалён!");
    }

    public static void contactSuccessfullyInput() {
        System.out.println("Контакты успешно добавлены!");
    }

    public static void contactSuccessfullyExtract() {
        System.out.println("Контакты успешно экспортированы!");
    }
}

