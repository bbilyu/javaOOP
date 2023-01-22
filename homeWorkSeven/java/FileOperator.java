package homeWorkOne;
// Оператор, работает и импортом и экспортом фалов
import java.io.*;
import java.util.ArrayList;


public class FileOperator {

    public static void inputContactsHorisontalFormat(String fileName, PhoneBook phoneBook) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                String[] contact = line.split(" ");
                phoneBook.getAllContacts().add(new Contact(contact[0], contact[1], Long.parseLong(contact[2])));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            Interface.fileNotFound();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void inputContactsVerticalFormat(String fileName, PhoneBook phoneBook) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            ArrayList<String> contact = new ArrayList<>();
            while (line != null) {
                if (line.length() != 0) {
                    contact.add(line);
                }
                if (contact.toArray().length == 3) {
                    phoneBook.getAllContacts().add(new Contact(contact.get(0), contact.get(1), Long.parseLong(contact.get(2))));
                    contact = new ArrayList<>();
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            Interface.fileNotFound();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void extractContactsHorisontalFormat(String fileName, PhoneBook phoneBook) throws IOException {
        if (checkFile(fileName)) {
            try {
                PrintWriter pw = new PrintWriter(new File(fileName));
                for (Contact c : phoneBook.getAllContacts()) {
                    pw.write(String.format("%s %s %s\n", c.getName(), c.getSurname(), c.getPhoneNumber()));
                }
                pw.flush();
                pw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void extractContactsVerticalFormat(String fileName, PhoneBook phoneBook) throws IOException {
        if (checkFile(fileName)) {
            try {
                PrintWriter pw = new PrintWriter(new File(fileName));
                for (Contact c : phoneBook.getAllContacts()) {
                    pw.write(String.format("%s\n%s\n%s\n\n", c.getName(), c.getSurname(), c.getPhoneNumber()));

                }
                pw.flush();
                pw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static boolean checkFile(String fileName) throws IOException {
        File outFile = new File(fileName);
        if (!outFile.exists()) {
            if (Interface.fileNotFound()) {
                outFile.createNewFile();
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
