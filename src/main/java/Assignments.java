import java.util.ArrayList;

public class Assignments {
    ArrayList<String> assignmentName = new ArrayList<>();
    ArrayList<String> assignmentScore = new ArrayList<>();

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
}
