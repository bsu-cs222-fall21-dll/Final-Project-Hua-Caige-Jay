import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Grading {
    Scanner scanner = new Scanner(System.in);
    Students students = new Students();
    String input = "3";

    public Grading() throws FileNotFoundException {
    }
    public void studentFindTeacher() throws IOException {
        System.out.println("Enter 1 to create student, 2 to look for student");
        input = scanner.nextLine();
        System.out.println("Entering teacher's view...");
        ifStateTeacher(input);
    }
    public void ifState(String input) throws IOException {
        if (input.equals("1")){
            students.findStudent();
        } else {
            System.out.println("Wrong input");
            students.printWriter.close();
        }
    }
    public void ifStateTeacher(String input) throws IOException {
        if (input.equals("1")){
            System.out.println("Enter student's name: ");
            String name = scanner.nextLine();
            String ID = studentID();
            Students.makeStudent(name,ID);
            studentFindTeacher();

        } else if (input.equals("2")) {
            students.findStudentTeacher();
        } else {
            System.out.println("Wrong input");
            students.printWriter.close();
        }
    }
    public String studentID(){
        System.out.println("Enter student's ID:");
        String ID = scanner.nextLine();
        if(ID.equals("12345")){
            System.out.println("You can't use this password");
            studentID();
        }
        else{
            System.out.println("Good password");
        }
        return ID;
    }
}
