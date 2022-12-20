package homeWorkTwo;

import java.util.ArrayList;

public class Families {
    ArrayList<FamilyTree> families;
    public Families() {
        families = new ArrayList<>();
    }

    public void addFamily(FamilyTree family) {
        families.add(family);
    }

    public ArrayList<FamilyTree> getAllFamly() {
        return families;
    }

    public FamilyTree getFamily(int index) {
        return families.get(index);
    }
    public void deleteFamily(FamilyTree family) {
        families.remove(family);
    }
    public void clearFamilies(){
        families = new ArrayList<>();
        Interface.familiesSuccessfullyClear();
    }
}
