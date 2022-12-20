package homeWorkTwo;

import java.util.ArrayList;

public abstract class BasePeople {
    String name;
    String surname;
    String patronymic;

    Childs childs;
    Parents parents;

    protected BasePeople(String peopleSurname,String peopleName,String peoplePatronymic) {
        name = peopleName;
        surname = peopleSurname;
        patronymic = peoplePatronymic;
        childs = new Childs();
        parents = new Parents();
    }

    public void setName(String peopleName) {
        name = peopleName;
    }
    public void setSurname(String peopleSurnamet) {
        surname = peopleSurnamet;
    }
    public void setPatronymic(String peoplePatronymic) {
        patronymic = peoplePatronymic;
    }

    public ArrayList<BasePeople> getParents() {
        return parents.getParents();
    }

    public ArrayList<BasePeople> getChilds() {
        return childs.getChilds();
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
}
