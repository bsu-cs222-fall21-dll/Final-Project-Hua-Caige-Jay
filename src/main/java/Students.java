import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    File myObj = new File("src/main/resources/StudentFile.txt");
    PrintWriter printWriter = new PrintWriter(myObj);
    static ArrayList<Object> listFinal = new ArrayList<>();
    static ArrayList<String> callList2 = new ArrayList<>();

    SubStudents subStudents = new SubStudents();

    public Students() throws FileNotFoundException {
    }

    public void callStudent() throws IOException {
        findStudent();
    }
    public void findStudent() throws IOException {
        Students students = new Students();
        Teacher teacher = new Teacher();
        System.out.println("1: adding grades to students or reviewing the grades\n2: create a student\n--------------");
        String input = scanner.nextLine();
        if(input.equals("1")){
            System.out.println("Enter a ID of a student:\n--------------");
            String tempID = scanner.nextLine();
            subStudents.IdStudents(tempID);
        }else if(input.equals("2")){
            teacher.teacherCall();
        }else{
            System.out.println("Chose the right number!!\n--------------");
            findStudent();
        }
    }
    public static void makeStudent(String name, String id){
        ArrayList<String> callList = new ArrayList<>();
        callList.add(name);
        callList.add(id);
        callList2.add(callList.get(1));
        listFinal.add(callList);
    }
    public void listOfAllStudents(){
        for(int i = 0; i < listFinal.size(); i++){
            System.out.println(listFinal.get(i));
        }
    }
}
