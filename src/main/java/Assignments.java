import java.util.ArrayList;
import java.util.Scanner;

public class Assignments {
    ArrayList<String> assignmentName = new ArrayList<>();
    ArrayList<String> assignmentScore = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> moduleAdd = new ArrayList<>();

    public void addName(String name){
        assignmentName.add(name);
    }
    public void removeName(String name){
        assignmentName.remove(name);
    }
    public void addScore(String score){
        assignmentScore.add(score);
    }
    public void removeScore(String score){
        assignmentScore.remove(score);
    }

    public Object makeAt(String section) {
        System.out.printf("What is the Assignments name?\n");
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.println();
        System.out.printf("What grade is the %s?\n",aName);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);
        Object moduleSet = moduleAdd;
        moduleAdd.remove(0); moduleAdd.remove(0);
        return moduleSet;
    }
}
