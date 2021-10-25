import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    @Test
    public void findListTest(){
        Students students = new Students();
        Object nullCheck = null;
        Assertions.assertEquals( nullCheck ,students.findStudent(""));
    }
}
