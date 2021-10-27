import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Students students = new Students();
        Grading grading  = new Grading();
        int quit = 0;
        String answer;
        System.out.println("Welcome to the Zybra ");
        while(quit == 0){
            System.out.println("Enter 1 for teacher, 2 for student, or q to quit");
            answer = scanner.nextLine();
            if (answer.equals("1")){
                teacher.teacherCall();
            }else if (answer.equals("2")){
                students.callStudent();
            }else if (answer.equals("q")){
                break;
            }
        }
    }
}
