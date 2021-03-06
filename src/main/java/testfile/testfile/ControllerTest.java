package testfile.testfile;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

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

        // Note: Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("filename.txt")));
        return "Welcome" + data;

    }

}
