import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Grading {
    Scanner scanner = new Scanner(System.in);
    Students students = new Students();
    String input = "3";

    public Grading() throws FileNotFoundException {
    }

    public void studentFind() throws IOException {
        System.out.println("Enter 1 to create student, 2 to look for student");
        input = scanner.nextLine();
        ifState(input);
    }
    public void ifState(String input) throws IOException {
        if (input.equals("1")){
            System.out.println("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student's ID:");
            String ID = scanner.nextLine();
            students.createStudent(name, ID);
            studentFind();
        } else if (input.equals("2")) {
            System.out.println(students.findStudent());
            studentFind();
        } else {
            System.out.println("Wrong input");
            students.printWriter.close();
        }
    }
}
