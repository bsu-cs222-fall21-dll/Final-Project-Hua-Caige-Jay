import java.util.ArrayList;
import java.util.Scanner;

public class SubStudents {
    Lists lists = new Lists();
    Scanner scanner = new Scanner(System.in);
    public void IdStudents(String id){
        for (int i = 0; i < Students.listFinal.size(); i++){
            String temp = Students.callList2.get(i);
            findSpecStudent(temp, id);
        }
        System.out.println("Couldn't find student's ID");
    }

    private void findSpecStudent(String find, String id) {
        if(find.equals(id)){
            System.out.println("Here are some grades");

        } else {
            System.out.print("");
        }
    }

}
