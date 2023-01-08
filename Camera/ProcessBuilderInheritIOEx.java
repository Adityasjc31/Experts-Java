package Camera;

import java.io.IOException;

public class ProcessBuilderInheritIOEx {

    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("cmd.exe", "/c", "dir");

        Process process = processBuilder.inheritIO().start();

        int exitCode = process.waitFor();
        System.out.printf("Program ended with exitCode %d", exitCode);
    }
}