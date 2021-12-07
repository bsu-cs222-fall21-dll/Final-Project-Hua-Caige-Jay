import java.util.ArrayList;
import java.util.Scanner;

public class SubStudents {
    Grades grades = new Grades();
    Lists lists = new Lists();
    Scanner scanner = new Scanner(System.in);
    public void IdStudents(String id){
        for (int i = 0; i < Students.listFinal.size(); i++){
            String temp = Students.callList2.get(i);
            findSpecStudentT(temp, id);
        }
        System.out.println("Couldn't find student's ID");
    }

    private void findSpecStudent(String find, String id) {
        if(find.equals(id)){
            System.out.println("Here are some grades");
            //show grades only
            grades.viewModule();
        } else {
            System.out.print("");
        }
    }
    private void findSpecStudentT(String find, String id) {
        if(find.equals(id)){
            System.out.println("Enter teachers id or 2 for student");
            String call = scanner.nextLine();
            if(call.equals("12345")){
                grades.addModule();
            } else {
                System.out.println("Here are some grades");
                //show grades only
                grades.viewModule();
            }
        } else {
            System.out.print("");
        }
    }

}
