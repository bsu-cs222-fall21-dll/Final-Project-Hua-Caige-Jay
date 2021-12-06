import java.util.ArrayList;
import java.util.Scanner;

public class Attendance {
    ArrayList<String> attendanceName = new ArrayList<>();
    ArrayList<String> attendanceScore = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> moduleAdd = new ArrayList<>();

    public void addName(String name){
        attendanceName.add(name);
    }
    public void removeName(String name){
        attendanceName.remove(name);
    }
    public void addScore(String score){
        attendanceScore.add(score);
    }
    public void removeScore(String score){
        attendanceScore.remove(score);
    }

    public Assignments makeAt(String section) {
        System.out.printf("What is the %s name?\n",section);
        String aName = scanner.nextLine();
        moduleAdd.add(0, aName);
        System.out.println();
        System.out.printf("What grade is the %s\n",section);
        String aNum = scanner.nextLine();
        moduleAdd.add(1, aNum);
        Object moduleSet = moduleAdd;
        moduleAdd.remove(0); moduleAdd.remove(0);
        return (Assignments) moduleSet;
    }
}
