package homeWorkTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static int mainTree() {
        Scanner console = new Scanner(System.in);
        System.out.println("Меню выбора: \n" +
                "1 - Добавить фамильное дерево\n" +
                "2 - Удалить фамильное дерево\n" +
                "3 - Показать список деревьев\n" +
                "4 - Изменить фамильное дерево\n" +
                "5 - Отчистить фамильное дерево \n" +
                "6 - Выход\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }

    public static int mainPeople() {
        Scanner console = new Scanner(System.in);
        System.out.println("Меню выбора: \n" +
                "1 - Добавить члена семьи\n" +
                "2 - Показать родителей\n" +
                "3 - Показать детей\n" +
                "4 - Изменить данные члена семьи\n" +
                "5 - Удалить члена семьи\n" +
                "6 - Показать всех членов семьи\n" +
                "7 - Выход\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }
    public static boolean chooseDataType() {
        homeWorkOne.Interface.clearConsole();
        Scanner console = new Scanner(System.in);
        System.out.println("Показать полные данные?: \n" +
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

    public static int chooseChangePeople() {
        Scanner console = new Scanner(System.in);
        System.out.println("Изменение контакта: \n" +
                "Измененить:\n" +
                "1 - Имя\n" +
                "2 - Фамилию\n" +
                "3 - Отчество\n" +
                "4 - Возраст\n" +
                "5 - Рост\n" +
                "6 - Вес\n" +
                "7 - Пол\n" +
                "Указать:\n" +
                "8 - Родителя\n" +
                "9 - Ребенка\n" +
                "Выберите пункт: ");
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        int n = console.nextInt();
        return n;
    }


    public static void printAllFamilies(Families families) {
        System.out.println("Список деревьев:");
        if (families.getAllFamly().size() == 0) {
            System.out.println("Пусто!");
        } else {
            for (FamilyTree family : families.getAllFamly()) {
                System.out.println(String.format("%d. %s", families.getAllFamly().indexOf(family) + 1, family.getBaseSurname()));
            }
        }
    }
    public static void printAllPeopleSlimData(FamilyTree family) {
        System.out.println("Список родственников:");
        if (family.getAllPeople().toArray().length == 0) {
            System.out.println("Пусто!");
        } else {
            for (BasePeople p : family.getAllPeople()) {
                System.out.println(String.format("%d. %s %s %s", family.getAllPeople().indexOf(p) + 1,p.getSurname(), p.getName(), p.getPatronymic()));
            }
        }
    }
    public static void printAllPeopleFullData(FamilyTree family) {
        System.out.println("Список родственников:");
        if (family.getAllPeople().toArray().length == 0) {
            System.out.println("Пусто!");
        } else {
            for (BasePeople p : family.getAllPeople()) {
                System.out.println(String.format("%d. %s %s %s возраст: %d рост: %d вес: %d пол: %s", family.getAllPeople().indexOf(p) + 1, p.getSurname(), p.getName(), p.getPatronymic(),((People)(p)).getAge(),((People)(p)).getHeight(),((People)(p)).getWeight(),((People)(p)).getGender()));
            }
        }
    }
    public static void printAllParents( ArrayList<BasePeople> parent) {
        System.out.println("Список родителей:");
        if (parent.toArray().length == 0) {
            System.out.println("Пусто!");
        } else {
            for (BasePeople p : parent) {
                System.out.println(String.format("%d. %s %s %s", parent.indexOf(p) + 1,p.getSurname(), p.getName(), p.getPatronymic()));
            }
        }
    }
    public static void printAllChilds( ArrayList<BasePeople> child) {
        System.out.println("Список детей:");
        if (child.toArray().length == 0) {
            System.out.println("Пусто!");
        } else {
            for (BasePeople p : child) {
                System.out.println(String.format("%d. %s %s %s", child.indexOf(p) + 1,p.getSurname(), p.getName(), p.getPatronymic()));
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
    public static String inputPatronymic() {
        System.out.println("Введите Отчество: ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextLong()) {
            System.out.println("Пожалуйста введите текст!");
            console.nextLine();
        }
        return console.nextLine();
    }

    public static long inputAge() {
        System.out.println("Введите возраст: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextLong()) {
            System.out.println("Пожалуйста введите номер в числовом формате!");
            console.next();
        }
        return console.nextLong();
    }
    public static long inputHeight() {
        System.out.println("Введите рост человека: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextLong()) {
            System.out.println("Пожалуйста введите номер в числовом формате!");
            console.next();
        }
        return console.nextLong();
    }
    public static long inputWeight() {
        System.out.println("Введите вес человека: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextLong()) {
            System.out.println("Пожалуйста введите номер в числовом формате!");
            console.next();
        }
        return console.nextLong();
    }

    public static String inputGender() {
        System.out.println("Введите пол человека: ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextLong()) {
            System.out.println("Пожалуйста введите текст!");
            console.nextLine();
        }
        return console.nextLine();
    }

    public static int indexFamilyInList(Families families) {
        printAllFamilies(families);
        System.out.println("Выберите семью: ");
        Scanner console = new Scanner(System.in);
        while (!console.hasNextInt() || !console.hasNextLong()) {
            System.out.println("Пожалуйста введите число!");
            console.next();
        }
        return console.nextInt() - 1;
    }
    public static int indexPeopleInList(FamilyTree family) {
        printAllPeopleSlimData(family);
        System.out.println("Выберите человека: ");
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

    public static void familiesSuccessfullyClear() {
        System.out.println("Успешно!");
    }

}
