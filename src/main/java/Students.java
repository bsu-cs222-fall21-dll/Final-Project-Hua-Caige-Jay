import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    File myObj = new File("src/main/resources/StudentFile.txt");
    PrintWriter printWriter = new PrintWriter(myObj);
    Lists lists = new Lists();

    public Students() throws FileNotFoundException {
    }

    public String callStudent(){
        System.out.println("What is your ID");
        String sID = scanner.nextLine();
        System.out.println();
        return sID;

    }
    public void findStudent() throws FileNotFoundException {
        Grading grading = new Grading();
        System.out.println("1 for all Students 2 for individual student");
        String input = scanner.nextLine();
        if(input.equals("1")){
            listOfAllStudents();
        } else if (input.equals("2")){
            String sID = callStudent();
            lists.makeAt(sID,grading.chooseSection());
        }else{
            System.out.println("Invalid input. please enter the correct number for choices");
        }
    }
    public void listOfAllStudents(){
        try {
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            System.out.println(myObj);
            myReader.close();
        } catch(IOException ioException){
            System.out.println("There was no File Found!!!");
        }
    }
}
