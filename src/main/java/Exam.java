import java.util.ArrayList;

public class Exam {
    ArrayList<String> testName = new ArrayList<>();
    ArrayList<String> testScore = new ArrayList<>();

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
}
