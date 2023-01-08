package Camera;
import java.io.File;
import java.io.IOException;

public class ProcessBuilderRedirectIOEx {

    public static void main(String[] args) throws IOException {

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("cat")
                .redirectInput(new File("C:\\Users\\adity\\Documents\\", "input.txt"))
                .redirectOutput(new File("C:\\Users\\adity\\Documents\\", "output1.txt"))
                .start();
    }
}