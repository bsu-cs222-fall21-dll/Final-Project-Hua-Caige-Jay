import java.util.ArrayList;
import java.util.Scanner;

public class Lists{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> individualA = new ArrayList<>();
    ArrayList<Object> attendance = new ArrayList<>();
    public void codeMightUse(){
//        """
//        ArrayList<Object> individualT = new ArrayList<>();
//        ArrayList<Object> test = new ArrayList<>();
//        ArrayList<Object> individualE = new ArrayList<>();
//        ArrayList<Object> exam = new ArrayList<>();
//        ArrayList<Object> individualQ = new ArrayList<>();
//        ArrayList<Object> quiz = new ArrayList<>();
//        """
    }
    public void makeAt(String ID,String section) {
        System.out.printf("What is the %s name?\n",section);
        String aName = scanner.nextLine();
        individualA.add(0, aName);
        System.out.println();
        System.out.printf("What grade is the %s\n",section);
        String aNum = scanner.nextLine();
        individualA.add(1, aNum);
        attendance.add(individualA);
        System.out.println(attendance.get(0));
        individualA.remove(0); individualA.remove(0);
    }
    public void makeStudent(String name, String ID){
        //put student into file list to be uploaded to student file based on id
    }
}
