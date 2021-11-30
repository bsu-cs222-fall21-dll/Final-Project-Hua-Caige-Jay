import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    File myObj = new File("src/main/resources/StudentFile.txt");
    PrintWriter printWriter = new PrintWriter(myObj);
    Lists lists = new Lists();

    public Students() throws FileNotFoundException {
    }

    public void callStudent() throws FileNotFoundException {
        findStudent();
    }
    public void findStudent() throws FileNotFoundException {
        Grading grading = new Grading();
        System.out.println("1 for individual student");
        String input = scanner.nextLine();
        if(input.equals("1")){
            System.out.println();
        }else{
            System.out.println("Invalid input. Please enter 1 to proceed");
        }
    }
    public static void makeStudent(String name, String id){

    }

    public void findStudentTeacher() throws FileNotFoundException {
        Grading grading = new Grading();
        System.out.println("1 for all Students 2 for individual student");
        String input = scanner.nextLine();
        if(input.equals("1")){
            listOfAllStudents();
        } else if (input.equals("2")){
            System.out.println();
        }else{
            System.out.println("Invalid input. Please enter 1 or 2 to proceed");
        }
    }
    public void listOfAllStudents(){

    }
}
