package homeWorkThree;

public class JSON implements TitleFormat{
    @Override
    public void print(int age,int salary,String name) {
        System.out.println("{\n" +
                "'worker': {\n" +
                "'age':" + age + ",\n" +
                "'salary':" + salary + ",\n" +
                "'name':'" + name + "',\n" +
                "}\n" +
                "}");
    }
}
