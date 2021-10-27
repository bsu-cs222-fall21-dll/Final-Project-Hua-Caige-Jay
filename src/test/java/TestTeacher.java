import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestTeacher {
    @Test
    public void test(){
        Teacher teacher = new Teacher();
        String ID = "12345";
        String input = teacher.realID;
        Assertions.assertEquals(ID,input);
    }
    @Test
    public void test2() throws IOException {
        Teacher teacher = new Teacher();
        teacher.tries = 4;
        teacher.getID("123");
        int max = 4;
        Assertions.assertEquals(max, teacher.tries);
    }
}
