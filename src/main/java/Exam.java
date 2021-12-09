import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> moduleAdd = new ArrayList<>();
    ArrayList<String> examName = new ArrayList<>();
    ArrayList<String> examScore = new ArrayList<>();

    public void addName(String name){
        examName.add(name);
    }
    public void removeName(String name){
        examName.remove(name);
    }
    public void addScore(String score){
        examScore.add(score);
    }
    public void removeScore(String score){
        examScore.remove(score);
    }

    public ArrayList<String> makeAt() {
        System.out.printf("What is the Exam's name?\n");
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.println();
        System.out.printf("What grade is the %s\n", aName);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);

        return moduleAdd;
    }
}
