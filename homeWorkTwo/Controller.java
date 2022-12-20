package homeWorkTwo;

import java.io.IOException;

public class Controller {
    public static void start(Families families) throws IOException {
        switch (Interface.mainTree()) {
            case 1:
                Interface.clearConsole();
                families.addFamily(new FamilyTree(Interface.inputSurname()));
                Interface.pressEnter();
                Interface.clearConsole();
                start(families);
                break;
            case 2:
                Interface.clearConsole();
                families.deleteFamily(families.getFamily(Interface.indexFamilyInList(families)));
                Interface.pressEnter();
                Interface.clearConsole();
                start(families);
            case 3:
                Interface.clearConsole();
                Interface.printAllFamilies(families);
                Interface.pressEnter();
                Interface.clearConsole();
                start(families);
            case 4:
                Interface.clearConsole();
                int indexFamily = Interface.indexFamilyInList(families);
                Interface.clearConsole();
                boolean exit = true;
                while (exit) {
                    switch (Interface.mainPeople()) {
                        case 1:
                            families.getFamily(indexFamily).addPeople(new People(Interface.inputSurname(),Interface.inputName(), Interface.inputPatronymic(), Interface.inputAge(), Interface.inputHeight(), Interface.inputWeight(), Interface.inputGender()));
                            Interface.pressEnter();
                            continue;
                        case 2:
                            Interface.printAllParents(families.getFamily(indexFamily).getPeople(Interface.indexPeopleInList(families.getFamily(indexFamily))).parents.getParents());
                            Interface.pressEnter();
                            continue;
                        case 3:
                            Interface.printAllChilds(families.getFamily(indexFamily).getPeople(Interface.indexPeopleInList(families.getFamily(indexFamily))).childs.getChilds());
                            Interface.pressEnter();
                            continue;
                        case 4:
                            int parametr = Interface.chooseChangePeople();
                            families.getFamily(indexFamily).changePeople(families.getFamily(indexFamily).getPeople(Interface.indexPeopleInList(families.getFamily(indexFamily))), parametr,families.getFamily(indexFamily));
                            Interface.pressEnter();
                            continue;
                        case 5:
                            families.getFamily(indexFamily).deletePeople(families.getFamily(indexFamily).getPeople(Interface.indexPeopleInList(families.getFamily(indexFamily))));
                            Interface.pressEnter();
                            continue;
                        case 6:
                            if (Interface.chooseDataType()) {
                                Interface.printAllPeopleFullData(families.getFamily(indexFamily));
                            }
                            else {
                                Interface.printAllPeopleSlimData(families.getFamily(indexFamily));
                            }
                            Interface.pressEnter();
                            continue;
                        case 7:
                            families.getFamily(indexFamily);
                    }
                }
                Interface.clearConsole();
                start(families);
            case 5:
                families.clearFamilies();
                Interface.pressEnter();
                Interface.clearConsole();
                start(families);
            case 6:
                System.exit(1);
        }
    }
}
