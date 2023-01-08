package record_classes.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ProcessBuilderEx
{
    public static void main(String[] args) throws IOException {

        ProcessBuilder processBuilder = new ProcessBuilder();
        String cmd="";
        while(!cmd.equalsIgnoreCase("Exit"))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a command : ");
            cmd = sc.nextLine();

            //processBuilder.command("cmd.exe", "/c", "ping");
            processBuilder.command("cmd.exe","/c",cmd);
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
}