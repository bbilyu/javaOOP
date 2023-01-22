package homeWorkThree;

public class MD implements TitleFormat{
    @Override
    public void print(int age,int salary,String name) {
        System.out.println("Worker\n" +
                "* age " + age +"\n" +
                "* salary " + salary + "\n" +
                "* name " + name + "\n");
    }
}
