import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    ArrayList<Object> temp = new ArrayList<>();
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
                    temp.add(testList.add(tests.makeAt(input)));
                    break label;
                case "2":
                    section = "Assignments";
                    ArrayList<Object> assignmentList = new ArrayList<>();
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
                    break;
            }
        }
    }
    public void viewModule(){
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
                    System.out.println(temp);
                    break label;
                case "2":
                    section = "Assignments";
                    ArrayList<Object> assignmentList = new ArrayList<>();
                    System.out.println(assignmentList);
                    break label;
                case "3":
                    section = "Attendance";
                    ArrayList<Attendance> attendanceList = new ArrayList<>();
                    System.out.println(attendanceList);
                    break label;
                case "4":
                    section = "Exam";
                    ArrayList<Exam> examList = new ArrayList<>();
                    System.out.println(examList);
                    break label;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }
}
