package homeWorkThree;



public class Button {
    public Button() {
    }
    void click(TitleFormat format, Worker worker) {
        format.print(worker.getAge(), worker.getSalary(),worker.getName());
    }

}
