import java.util.ArrayList;

public class Exam {
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
}
