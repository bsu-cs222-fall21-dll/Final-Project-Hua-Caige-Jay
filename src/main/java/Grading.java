import java.util.Scanner;

public class Grading {
    Scanner scanner = new Scanner(System.in);
    Students students = new Students();
    public void testing() {
        System.out.println("Enter 1 to create student, 2 to look for student");
        String input = scanner.nextLine();
        if (input.equals("1")){
            System.out.println("works");
        } else if (input.equals("2")) {
            System.out.println("Enter Student's ID");
            String sID = scanner.nextLine();
            students.findStudent(sID);
        } else {
            System.out.println("Wrong input");
        }
    }
}
