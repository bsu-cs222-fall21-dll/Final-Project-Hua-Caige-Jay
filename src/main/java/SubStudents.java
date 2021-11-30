import java.util.ArrayList;
import java.util.Scanner;

public class SubStudents {
    Lists lists = new Lists();
    Scanner scanner = new Scanner(System.in);
    Tests tests = new Tests();
    public void IdStudents(String id){

    }
    public void addModule(){
        String section;
        label:
        while(1 == 1){
            System.out.println("Type 1 for Tests, 2 for Quizzes, 3 for Attendance, 4 for Exam");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    section = "Tests";
                    ArrayList<Tests> testList = new ArrayList<>();
                    testList.add(tests.makeAt(input));
                case "2":
                    section = "Assignments";
                    ArrayList<Assignments> assignmentList = new ArrayList<>();
                    break label;
                case "3":
                    section = "Attendance";
                    ArrayList<Attendance> attendanceList = new ArrayList<>();
                    break label;
                case "4":
                    section = "Exam";
                    ArrayList<Exam> examList = new ArrayList<>();
                    break label;
                default:
                    System.out.println("Wrong Input");
                    addModule();
                    break;
            }
        }
    }
}
