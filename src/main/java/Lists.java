import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Lists {
    ArrayList<String> assignments = new ArrayList<>();
    ArrayList<Float> grade = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Hashtable assign;
    public ArrayList<String> getEditedGrade(String input) {
        assignments.add(null);
        return assignments;
    }
    public Hashtable assignmentInterface(){
        System.out.println("How many assignments do you want to add");
        int amount = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i <= amount;i++){
            System.out.println(addAssignment());
            assign = addAssignment();
        }
        return assign;
    }
    public Hashtable<String, Float> addAssignment(){
        System.out.println("Enter the Assignments name");
        String name = scanner.nextLine();
        System.out.println("Enter the Assignments grade");
        float grade = Float.parseFloat(scanner.nextLine());
        Hashtable<String, Float> listOfGrades = new Hashtable<>();
        listOfGrades.put(name,grade);
        return listOfGrades;
    }
}
