import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IndexTest {

    @org.junit.Test
    @Test
    public void testMainOutput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        index.main(null);

        System.setOut(originalOut);

        assertEquals("Hello, World!\n", outputStream.toString());
    }
}

