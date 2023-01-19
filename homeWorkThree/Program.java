package homeWorkThree;

public class Program {

  public static void main(String[] args) {

    homeWorkThree.Document doc = new Document();
    doc.setWorker(WorkerBuilder.Create()
            .setAge(23)
            .setSalary(115)
            .setName("Jon")
            .build());

    doc.setFormat(new HTML());
    doc.SaveAs();

    doc.setFormat(new MD());
    doc.SaveAs();

    doc.setFormat(new JSON());
    doc.SaveAs();

  }
}


// #region




