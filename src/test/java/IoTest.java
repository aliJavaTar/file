import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class IoTest {

    @Test
    public void writOutPutStream() {

        try {
            FileOutputStream outputStream = new FileOutputStream("text.txt");
            outputStream.write("hi".getBytes(UTF_8));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }


    }
}
