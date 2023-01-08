package Camera;

import java.io.IOException;

import java.util.*;
public class ProcessBuilderEnvEx2 {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder();
        Map env = pb.environment();

        env.put("mode", "development");

        pb.command("cmd.exe", "/c", "echo", "%mode%");

        pb.inheritIO().start();
    }
}