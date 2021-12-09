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
        System.out.println("1: create a file of student\n" +
                "2: q to go back to the main menu\n--------------");
        input = scanner.nextLine();
        System.out.println("Entering teacher's view...");
        ifStateTeacher(input);
    }
    public void ifState(String input) throws IOException {
        if (input.equals("1")){
            students.findStudent();
        } else {
            System.out.println("Wrong input\n--------------");
            students.printWriter.close();
        }
    }
    public void ifStateTeacher(String input) throws IOException {
        if (input.equals("1")){
            System.out.println("Create a name of a student:\n-------------- ");
            String name = scanner.nextLine();
            String ID = studentID();
            Students.makeStudent(name,ID);
            studentFindTeacher();

        } else {
            System.out.println("Wrong input\n--------------");
            students.printWriter.close();
        }
    }
    public String studentID(){
        System.out.println("Create a ID of this student:\n--------------");
        String ID = scanner.nextLine();
        if(ID.equals("12345")){
            System.out.println("You can't use this password\n--------------");
            studentID();
        }
        else{
            System.out.println("Good password\n--------------");
        }
        return ID;
    }
}
