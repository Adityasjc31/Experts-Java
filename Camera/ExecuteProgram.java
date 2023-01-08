package Camera;

import java.io.IOException;

public class ExecuteProgram {

    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command("notepad.exe");

        Process process = processBuilder.start();

        int ret = process.waitFor();

        System.out.printf("Program exited with code: %d", ret);
    }
}