import java.util.Hashtable;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    Hashtable<String, Lists> students = new Hashtable<>();
    public void callStudent(){
        System.out.println("What is your ID");
        String sID = scanner.nextLine();
        Lists grades = findStudent(sID);
        System.out.println(grades);

    }
    public Lists findStudent(String id){
        return students.get(id);
    }
}
