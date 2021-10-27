import java.io.IOException;
import java.util.Scanner;

public class Grading {
    Scanner scanner = new Scanner(System.in);
    Students students = new Students();
    String sID = "1234";
    String input = "3";
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
        } else if (input.equals("2")) {
            System.out.println("Enter Student's ID");
            sID = scanner.nextLine();
            System.out.println(students.findStudent(sID));

        } else {
            System.out.println("Wrong input");
        }
    }
}
