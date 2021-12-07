import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    public void addModule(){
        Scanner scanner = new Scanner(System.in);
        Tests tests = new Tests();
        Assignments assignments = new Assignments();
        String section;
        label:
        while(1 == 1){
            System.out.println("Type 1 for Tests, 2 for Assignments, 3 for Attendance, 4 for Exam");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    section = "Tests";
                    ArrayList<Object> testList = new ArrayList<>();
                    testList.add(tests.makeAt(input));
                case "2":
                    section = "Assignments";
                    ArrayList<Assignments> assignmentList = new ArrayList<>();
                    assignmentList.add(assignments.makeAt(input));
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
