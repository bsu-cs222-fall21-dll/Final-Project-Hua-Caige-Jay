import java.util.ArrayList;

public class Attendance {
    ArrayList<String> attendanceName = new ArrayList<>();
    ArrayList<String> attendanceScore = new ArrayList<>();

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
}
