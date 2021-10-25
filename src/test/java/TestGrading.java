import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGrading {
    @Test
    public void test1(){
        Grading grading = new Grading();
        grading.ifState("1");
        Assertions.assertEquals("1",grading.input);
    }
    @Test
    public void test2(){
        Grading grading = new Grading();
        grading.ifState("2");
        Assertions.assertEquals("2",grading.input);
    }
    @Test
    public void test3(){
        Grading grading = new Grading();
        grading.ifState("3");
        Assertions.assertEquals("3", grading.input);
    }
}
