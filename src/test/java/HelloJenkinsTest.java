import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJenkinsTest {

    @Test
    void testMessage() {
        assertEquals("Hello from Jenkins! change for 1 minconfirm", HelloJenkins.message());
    }
}