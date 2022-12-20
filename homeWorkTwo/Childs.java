package homeWorkTwo;

import java.util.ArrayList;

public class Childs {

    ArrayList<BasePeople> childs;

    public Childs(){
        new ArrayList<>();
    }

    public Childs(BasePeople people){
        childs.add(people);
    }
    public  ArrayList<BasePeople> getChilds() {
        return childs;
    }
}
