import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    Scanner scanner = new Scanner(System.in);
    File myObj = new File("src/main/java/StudentFile.txt");
    PrintWriter printWriter = new PrintWriter(myObj);
    Lists lists = new Lists();

    public Students() throws FileNotFoundException {
    }

    public void callStudent(){
        System.out.println("What is your ID");
        String sID = scanner.nextLine();
        ArrayList<String> grades = findStudent();
        System.out.println(grades);

    }
    public ArrayList<String> findStudent(){
        File myObj = new File("src/main/java/StudentFile.txt");
        System.out.println("1 for all Students 2 for individual student");
        String input = scanner.nextLine();
        if(input.equals("1")){
            listOfAllStudents(myObj);
        } else if (input.equals("2")){
            System.out.println();
        }
        return lists.assignments;
    }
    public void createStudent(String name ,String ID) throws FileNotFoundException {
        printWriter.append((name + " " + ID + "\n"));
    }
    public void listOfAllStudents(File myObj){
        try {
            Scanner myReader = new Scanner(myObj);

            System.out.println(lists.assignmentInterface());

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
