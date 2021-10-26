import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    Lists lists = new Lists();
    public void callStudent(){
        System.out.println("What is your ID");
        String sID = scanner.nextLine();
        ArrayList<String> grades = findStudent(sID);
        System.out.println(grades);

    }
    public ArrayList<String> findStudent(String id){
        return lists.assignments;
    }
    public void createStudent(String name ,String ID){
        System.out.println(lists.assignmentInterface());

    }
}
