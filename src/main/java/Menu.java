import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Students students = new Students();
        int quit = 0;
        String answer;
        System.out.println("Welcome to the Zybra!!!");
        label:
        while(quit == 0){
            System.out.println("--Enter 1 to enter the grading " +
                               "system for classes or q to quit--");
            answer = scanner.nextLine();
            switch (answer) {
                case "1":
                    System.out.println("Entering Class...");
                    students.callStudent();
                    break;
                case "q":
                    break label;
                default:
                    System.out.println("Invalid input. please enter the correct number for choices");
                    break;
            }
        }
    }
}
