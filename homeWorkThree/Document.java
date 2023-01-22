package homeWorkThree;


public class Document {
    private TitleFormat format;

     private Button button;
    private Worker worker;
    public Document() {
    }

    public void setWorker(Worker peopleWorker) {
        worker = peopleWorker;
    }
    public Worker getWorker() {
        return  worker;
    }
    public void setFormat(TitleFormat f) {
        format = f;
    }
    public void SaveAs() {
        button = new Button();
        button.click(format,worker);
    }
}
