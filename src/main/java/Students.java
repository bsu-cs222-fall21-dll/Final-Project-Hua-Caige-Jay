import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    File myObj = new File("src/main/resources/StudentFile.txt");
    PrintWriter printWriter = new PrintWriter(myObj);
    Lists lists = new Lists();
    static ArrayList<Object> listFinal = new ArrayList<>();
    SubStudents subStudents = new SubStudents();

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
            subStudents.IdStudents("1234");
        }else{
            System.out.println("Invalid input. Please enter 1 to proceed");
        }
    }
    public static void makeStudent(String name, String id){
        ArrayList<String> callList = new ArrayList<>();
        callList.add(name);
        callList.add(id);
        listFinal.add(callList);
    }

    public void findStudentTeacher() throws FileNotFoundException {
        Grading grading = new Grading();
        System.out.println("1 for all Students 2 for individual student");
        String input = scanner.nextLine();
        if(input.equals("1")){
            listOfAllStudents();
        } else if (input.equals("2")){
            subStudents.IdStudents("1234");
        }else{
            System.out.println("Invalid input. Please enter 1 or 2 to proceed");
        }
    }
    public void listOfAllStudents(){
        for(int i = 0; i < listFinal.size(); i++){
            System.out.println(listFinal.get(i));
        }
    }
}
