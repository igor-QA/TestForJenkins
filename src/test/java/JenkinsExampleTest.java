import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JenkinsExampleTest {

    @Test
    void jenkinsTest(){
        int a = 6, b = 8, result, anotherResult = 10;
        result = a + b;

        Assertions.assertNotEquals(result, anotherResult);
    }
}

