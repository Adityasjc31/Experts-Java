package Camera;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedirectOutputEx {

    public static void main(String[] args) throws IOException {

        String homeDir = System.getProperty("user.home");

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("cmd.exe", "/c", "date /t");

        File fileName = new File(String.format("%s/Documents/output.txt", homeDir));

        processBuilder.redirectOutput(fileName);

        Process process = processBuilder.start();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}