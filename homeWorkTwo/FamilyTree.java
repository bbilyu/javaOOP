package homeWorkTwo;


import java.util.ArrayList;

public class FamilyTree {
    ArrayList<BasePeople> family;
    String baseSurname;
    public FamilyTree() {
        family = new ArrayList<>();
    }
    public FamilyTree(String basePeopleSurname) {
        family = new ArrayList<>();
        baseSurname = basePeopleSurname;
    }
    public FamilyTree(BasePeople people) {
        this();
        family.add(people);
    }
    public FamilyTree(ArrayList<BasePeople> peopleFamily) {
        this();
        family = peopleFamily;
    }

    protected void addPeople(BasePeople people) {
        family.add(people);
    }


    public void changePeople(BasePeople people, int parametrNumber,FamilyTree family) {
        switch (parametrNumber) {
            case 1:
                people.setName(Interface.inputName());
                break;
            case 2:
                people.setSurname(Interface.inputSurname());
                break;
            case 3:
                people.setPatronymic(Interface.inputPatronymic());
                break;
            case 4:
                ((People)(people)).setAge(Interface.inputAge());
                break;
            case 5:
                ((People)(people)).setHeight(Interface.inputHeight());
                break;
            case 6:
                ((People)(people)).setWeight(Interface.inputWeight());
                break;
            case 7:
                ((People)(people)).setGender(Interface.inputGender());
                break;
            case 8:
                people.parents.getParents().add(family.getPeople(Interface.indexPeopleInList(family)));
                break;
            case 9:
                people.childs.getChilds().add(family.getPeople(Interface.indexPeopleInList(family)));
                break;
        }
    }
    protected void setBaseSurname(String surname) {
        baseSurname = surname;
    }
    protected String getBaseSurname() {
        return baseSurname;
    }

    protected void deletePeople(BasePeople people) {
        family.remove(people);
    }


    public BasePeople getPeople(int index) {
        return family.get(index);
    }

    public ArrayList<BasePeople> getAllPeople() {
        return family;
    }

    public void deleteAllPeople() {
        family = new ArrayList<>();
    }
}
