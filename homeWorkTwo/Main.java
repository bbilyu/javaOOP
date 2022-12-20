package homeWorkTwo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Families families = new Families();
        Controller.start(families);
    }
}
