import java.util.ArrayList;
import java.util.Scanner;

public class Attendance {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> moduleAdd = new ArrayList<>();
    public ArrayList<String> makeAt() {
        System.out.printf("What is the Attendance name?\n");
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.printf("What grade is the %s?\n",aName);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);
        return moduleAdd;
    }
}
