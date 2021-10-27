import java.io.*;
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
    public void createStudent(String name ,String ID) throws IOException {
        File myObj = new File("src/main/java/StudentFile.txt");
        myObj.canWrite();
        Scanner myReader = new Scanner(myObj);
        FileWriter myWriter = new FileWriter(myObj);

        System.out.println(lists.assignmentInterface());

        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        System.out.println(myObj);
    }
}
