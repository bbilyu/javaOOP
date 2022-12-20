package homeWorkTwo;


import java.util.ArrayList;

public class People extends BasePeople{
    long age;
    long height;
    long weight;
    String gender;



    public People(String peopleSurname,String peopleName,String peoplePatronymic,long peopleAge, long peopleHeight, long peopleWeight, String peopleGender) {
        super(peopleSurname,peopleName,peoplePatronymic);
        age = peopleAge;
        height = peopleHeight;
        weight = peopleWeight;
        gender = peopleGender;


    }

    public People(String peopleSurname,String peopleName,String peoplePatronymic,long peopleAge, long peopleHeight, long peopleWeight, String peopleGender, Childs child , Parents parent) {
        this(peopleSurname,peopleName,peoplePatronymic,peopleAge,peopleHeight,peopleWeight,peopleGender);
        super.childs = child;
        super.parents = parent;
    }

    public void setAge(long peopleAge) {
        age = peopleAge;
    }
    public void setHeight(long peopleHeight) {
        height = peopleHeight;
    }
    public void setWeight(long peopleWeight) {
        weight = peopleWeight;
    }
    public void setGender(String peopleGender) {
        gender = peopleGender;
    }
    public long getAge() {
        return age;
    }
    public long getHeight() {
        return height;
    }
    public long getWeight() {
        return weight;
    }
    public String getGender() {
        return gender;
    }

}
