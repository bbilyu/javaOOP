package homeWorkThree;

public class Program {

  public static void main(String[] args) {

//    Word doc1 = new Word();
//    doc1.setModel(new StringFormat());
//    doc1.appendData("Раз два");
//
//    doc1.setFormat(new FunnyFormat());
//    doc1.click();
//
//    doc1.appendData("три четыре");
//    doc1.setFormat(new SadFormat());
//    doc1.click();
//
//    doc1.setFormat(new NewFormat());
//    doc1.click();

    homeWorkThree.Document doc = new homeWorkThree.Document();
    doc.setWorker(new homeWorkThree.Worker(23, 115, "Jon"));

    doc.setFormat(new homeWorkThree.HTML());
    doc.SaveAs();

    doc.setFormat(new homeWorkThree.MD());
    doc.SaveAs();

    doc.setFormat(new homeWorkThree.JSON());
    doc.SaveAs();

  }
}


// #region
class Document {
  homeWorkThree.TitleFormat format;

  homeWorkThree.Button button;
  homeWorkThree.Worker worker;
  public Document() {
  }

  public void setWorker(homeWorkThree.Worker peopleWorker) {
    worker = peopleWorker;
  }
  public homeWorkThree.Worker getWorker() {
    return  worker;
  }
  public void setFormat(homeWorkThree.TitleFormat f) {
    format = f;
  }
  public void SaveAs() {
    button = new homeWorkThree.Button();
    button.click(format,worker);
  }
}
class Button {

  public Button() {

  }
  void click(homeWorkThree.TitleFormat format, homeWorkThree.Worker worker) {
    format.print(worker.getAge(), worker.getSalary(),worker.getName());
  }

}

class Worker {
  int age;
  int salary;
  String name;

  public Worker(int peopleAge,int peopleSalary,String peopleName) {
    age = peopleAge;
    salary = peopleSalary;
    name = peopleName;
  }

  public void setAge(int peopleAge) {
    age = peopleAge;
  }
  public void setSalary(int peopleSalary) {
    salary = peopleSalary;
  }
  public void setName(String peopleName) {
    name = peopleName;
  }

  public int getAge() {
    return age;
  }
  public int getSalary() {
    return salary;
  }
  public String getName() {
    return name;
  }
}
interface TitleFormat {
  void print(int age,int salary,String name);
}

class HTML implements homeWorkThree.TitleFormat {

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

class MD implements homeWorkThree.TitleFormat {
  @Override
  public void print(int age,int salary,String name) {
    System.out.println("Worker\n" +
            "* age " + age +"\n" +
            "* salary " + salary + "\n" +
            "* name " + name + "\n");
  }

}

class JSON implements homeWorkThree.TitleFormat {
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
