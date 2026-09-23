import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJenkinsTest {

    @Test
    void testMessage() {
        assertEquals("Hello from Jenkins!", HelloJenkins.message());
    }
}