import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Students students = new Students();
        int quit = 0;
        String answer;
        System.out.println("Welcome to the Zybra!!!\n--------------");
        label:
        while(quit == 0){
            System.out.println("1: to enter the grading system for classes\n" +
                               "2: q to quit\n--------------");
            answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    System.out.println("Entering Class...\n--------------");
                    students.callStudent();
                    break;
                case "q":
                    break label;
                default:
                    System.out.println("Invalid input. please enter the correct number for choices\n--------------");
                    break;
            }
        }
    }
}
