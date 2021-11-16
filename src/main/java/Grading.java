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

    public String chooseSection(){
        String section = "Nothing was chosen";
        while(1 == 1){
            System.out.println("Type 1 for Tests, 2 for Quizzes, 3 for Attendance, 4 for Exam");
            String input = scanner.nextLine();
            if(input.equals("1")){
                section = "Tests";
                break;
            } else if(input.equals("2")){
                section = "Quiz";
                break;
            } else if(input.equals("3")){
                section = "Attendance";
                break;
            } else if(input.equals("4")){
                section = "Exam";
                break;
            } else {
                System.out.println("Wrong Input");
                chooseSection();
            }
        }
        return section;
    }
    public void studentFind() throws IOException {
        System.out.println("Enter 1 to create student, 2 to look for student");
        input = scanner.nextLine();
        ifState(input);
    }
    public void ifState(String input) throws IOException {
        Lists lists = new Lists();
        if (input.equals("1")){
            System.out.println("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter student's ID:");
            String ID = scanner.nextLine();
            lists.makeStudent(name,ID);

        } else if (input.equals("2")) {
            System.out.println("What is the sID");
            String sID = scanner.nextLine();
            students.findStudent();
        } else {
            System.out.println("Wrong input");
            students.printWriter.close();
        }
    }
}
