import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Students students = new Students();
        int quit = 0;
        String answer;
        System.out.println("Welcome to the Zybra ");
        while(quit == 0){
            System.out.println("Enter 1 for teacher, 2 for student, or q to quit");
            answer = scanner.nextLine();
            if (answer.equals("1")){
                System.out.println("Entering Security...");
                teacher.teacherCall();
            }else if (answer.equals("2")){
                System.out.println("Entering Class...");
                students.callStudent();
            }else if (answer.equals("q")){
                break;
            }else{
                System.out.println("Invalid input. please enter the correct number for choices");
            }
        }
    }
}
