package homeWorkThree;

public class HTML implements TitleFormat{
    @Override
    public void print(int age,int salary,String name) {
        System.out.println("<html>\n" +
                "<Worker>\n" +
                "<age>" + age + "</age>\n" +
                "<salary>" + salary + "</salary>\n" +
                "<name>" + name + "</name>\n" +
                "</Worker>\n" +
                "</html>\n");
    }
}
