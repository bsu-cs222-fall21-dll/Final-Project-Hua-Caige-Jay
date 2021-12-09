import java.util.ArrayList;
import java.util.Scanner;

public class Assignments {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<String> moduleAdd = new ArrayList<>();

    public ArrayList<String> makeAt() {
        System.out.printf("What is the Assignments name?\n");
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.println();
        System.out.printf("What grade is the %s?\n",aName);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);
        return moduleAdd;
    }
}
