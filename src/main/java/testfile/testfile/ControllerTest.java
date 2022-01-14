package testfile.testfile;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    @GetMapping("/get/{test}")
    public String home(@PathVariable("test") String test) throws IOException {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!" + test);
        myWriter.close();
        return "Welcome";

    }

}
