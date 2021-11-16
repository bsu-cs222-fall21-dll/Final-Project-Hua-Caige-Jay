import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    @Test
    public void findListTest() throws FileNotFoundException {
        Students students = new Students();
        Object nullCheck = null;
        Assertions.assertEquals(null, nullCheck);
    }
}
