package homeWorkTwo;

import java.util.ArrayList;

public class Parents {
    ArrayList<BasePeople> parents;

    public Parents(){
        new ArrayList<>();
    }

    public Parents(BasePeople people){
        parents.add(people);
    }

    public  ArrayList<BasePeople> getParents() {
        return parents;
    }



}
