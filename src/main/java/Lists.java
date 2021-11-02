import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Lists {
    ArrayList<String> assignments = new ArrayList<>();
    ArrayList<Float> grade = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Hashtable assign;
    public Hashtable assignmentInterface(){
        System.out.println("How many assignments do you want to add");
        int amount = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i <= amount - 1;i++){
            assign = addAssignment(chooseSection());
        }
        return assign;
    }
    public String chooseSection(){
        String section = "Nothing was chosen";
        while(1 == 1){
            System.out.println("Type 1 for Tests, 2 for Quizzes, 3 for Attendance, 4 for Exam");
            String input = scanner.nextLine();
            if(input.equals("q")){
                break;
            } else if(input.equals("1")){
                section = "Tests";
                break;
            } else if(input.equals("2")){
                section = "Quiz";
                break;
            } else if(input.equals("3")){
                section = "Attendance";
                break;
            } else if(input.equals("4")){
                section = "Exam";
                break;
            } else {
                System.out.println("Wrong Input");
                break;
            }
        }
        return section;
    }
    public Hashtable<String, Float> addAssignment(String section){
        System.out.println("Enter the Assignments name");
        String name = section + " " + scanner.nextLine();
        System.out.println("Enter the Assignments grade");
        float grade = Float.parseFloat(scanner.nextLine());
        Hashtable<String, Float> listOfGrades = new Hashtable<>();
        listOfGrades.put(name,grade);
        return listOfGrades;
    }

}
