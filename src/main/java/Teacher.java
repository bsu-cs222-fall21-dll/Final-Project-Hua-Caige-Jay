import java.util.Scanner;

public class Teacher {
    String realID = "12345";
    int tries = 0;

    Scanner scanner = new Scanner(System.in);
    Grading grading = new Grading();
    public void teacherCall() {
        System.out.println("Enter ID to get access to grading");
        String ID = scanner.nextLine();
        getID(ID);
    }

    private void getID(String id) {
        if(id.equals(realID)){
            System.out.println("Thanks");
            grading.testing();
        }else {
            if(tries <= 3){
                System.out.println("This isn't the right id");
                teacherCall();
                tries++;
            }else{
                System.out.println("You have been locked out");
                System.exit(1);
            }
        }
    }
}
