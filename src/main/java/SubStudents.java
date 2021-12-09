
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SubStudents {
    Grades grades = new Grades();
    Scanner scanner = new Scanner(System.in);


    public SubStudents() throws FileNotFoundException {
    }

    public void IdStudents(String id) throws FileNotFoundException {
        for (int i = 0; i < Students.listFinal.size(); i++){
            String temp = Students.callList2.get(i);
            findSpecStudentT(temp, id);
        }
    }

    public void findSpecStudentT(String find, String id) throws FileNotFoundException {
        Students students = new Students();
        if(find.equals(id)){
            System.out.println("Enter teachers password to add grades\n1: for showing student's grades\n--------------");
            String call = scanner.nextLine();
            if(call.equals("12345")){
                System.out.println("How many do you want to add?");
                String amount = scanner.nextLine();
                for (int temp = 0; temp < Integer.parseInt(amount); temp++){
                    grades.addModule();
                }
            } else if (call.equals("1")){
                grades.viewModule();
            }else{
                students.printWriter.close();
            }
        } else {
            System.out.println();
        }
    }
}