import java.util.ArrayList;
import java.util.Scanner;

public class Tests {
    ArrayList<String> testName = new ArrayList<>();
    ArrayList<String> testScore = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> moduleAdd = new ArrayList<>();

    public void addName(String name){
        testName.add(name);
    }
    public void removeName(String name){
        testName.remove(name);
    }
    public void addScore(String score){
        testScore.add(score);
    }
    public void removeScore(String score){
        testScore.remove(score);
    }
    public Object makeAt(String section){
        System.out.println("What is the Test's name?");
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.printf("What grade is the %s?\n",aName);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);
        Object moduleSet = moduleAdd;
        moduleAdd.remove(0); moduleAdd.remove(0);

        return moduleSet;
    }
}
