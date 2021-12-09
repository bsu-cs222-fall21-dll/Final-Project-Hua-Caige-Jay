import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Teacher {
    String realID = "12345";
    int tries = 0;

    Scanner scanner = new Scanner(System.in);
    Grading grading = new Grading();

    public Teacher() throws FileNotFoundException {
    }

    public void teacherCall() throws IOException {
        System.out.println("Enter your password to access to grading\n--------------");
        String ID = scanner.nextLine();
        getID(ID);
    }

    protected void getID(String id) throws IOException {
        if(id.equals(realID)){
            System.out.println("Entering Class...\n--------------");
            grading.studentFindTeacher();
        }else if(tries <= 1) {
            System.out.println("Incorrect ID\n--------------");
            tries++;
            teacherCall();
            }else if(tries <=2){
                System.out.println("Last try. Input valid ID, otherwise you will be locked out\n--------------");
                tries++;
                teacherCall();
                }else{
                    System.out.println("You have been locked out\n--------------");
                    System.exit(1);
            }
        }
    }