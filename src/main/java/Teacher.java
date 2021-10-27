import java.io.IOException;
import java.util.Scanner;

public class Teacher {
    String realID = "12345";
    int tries = 0;

    Scanner scanner = new Scanner(System.in);
    Grading grading = new Grading();
    public void teacherCall() throws IOException {
        System.out.println("Enter ID to get access to grading");
        String ID = scanner.nextLine();
        getID(ID);
    }

    protected void getID(String id) throws IOException {
        if(id.equals(realID)){
            System.out.println("Thanks");
            grading.studentFind();
        }else {
            if(tries <= 2){
                System.out.println("This isn't the right id");
                tries++;
                teacherCall();
            }else{
                System.out.println("You have been locked out");
                System.exit(1);
            }
        }
    }
}
