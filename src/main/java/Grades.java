import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    ArrayList<ArrayList<String>> testList = new ArrayList<>();
    ArrayList<ArrayList<String>> assignmentList = new ArrayList<>();
    ArrayList<ArrayList<String>> attendanceList = new ArrayList<>();
    ArrayList<ArrayList<String>> examList = new ArrayList<>();
    public void addModule(){
        Scanner scanner = new Scanner(System.in);
        Tests tests = new Tests();
        Assignments assignments = new Assignments();
        Attendance attendance = new Attendance();
        Exam exam = new Exam();
        label:
        while(true){
            System.out.println("1: Tests\n2: Assignments\n3: Attendance\n4: Exams\n--------------");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    testList.add(tests.makeAt());
                    break label;
                case "2":
                    assignmentList.add(assignments.makeAt());
                    break label;
                case "3":
                    attendanceList.add(attendance.makeAt());
                    break label;
                case "4":
                    examList.add(exam.makeAt());
                    break label;
                default:
                    System.out.println("Wrong Input\n--------------");
                    break;
            }
        }
    }

    private void gradeAll() {
        double totalGrade = allTest() * .4 + allAttendance() * .1 + allExam()*.2 + allAssignments()*.3;
        System.out.printf("%.2f",totalGrade);
    }
    public int allExam(){
        int totalGrade = 0;
        for(int exams = 0; exams < examList.size(); exams++){
            ArrayList<String> exam = examList.get(exams);
            int grade = Integer.parseInt(exam.get(1));
            totalGrade = totalGrade + grade;
        }
        int joplin = totalGrade/examList.size();
        return joplin;
    }
    public int allAssignments(){
        int totalGrade = 0;
        for(int assigns = 0; assigns < assignmentList.size(); assigns++){
            ArrayList<String> assign = assignmentList.get(assigns);
            int grade = Integer.parseInt(assign.get(1));
            totalGrade = totalGrade + grade;
        }
        int joplin = totalGrade/assignmentList.size();
        return joplin;
    }
    public int allTest(){
        int totalGrade = 0;
        for(int tests = 0; tests < testList.size(); tests++){
            ArrayList<String> test = testList.get(tests);
            int grade = Integer.parseInt(test.get(1));
            totalGrade = totalGrade + grade;
        }
        int joplin = totalGrade/testList.size();
        return joplin;
    }
    public int allAttendance(){
        int totalGrade = 0;
        for(int attend = 0; attend < attendanceList.size(); attend++){
            ArrayList<String> attendance = attendanceList.get(attend);
            int grade = Integer.parseInt(attendance.get(1));
            totalGrade = totalGrade + grade;
        }
        int joplin = totalGrade/attendanceList.size();
        return joplin;
    }

    public void viewModule(){
        Scanner scanner = new Scanner(System.in);
        label:
        while(true){
            System.out.println("1: Tests\n2: Assignments\n3: Attendance\n4: Exams\n5: Total grade.\n--------------");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println(testList);
                    break label;
                case "2":
                    System.out.println(assignmentList);
                    break label;
                case "3":
                    System.out.println(attendanceList);
                    break label;
                case "4":
                    System.out.println(examList);
                    break label;
                case "5":
                    gradeAll();
                    break label;
                default:
                    System.out.println("Wrong Input\n--------------");
                    break;
            }
        }
    }
}
