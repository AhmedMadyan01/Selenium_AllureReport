package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMD {
    public static void executeCommandLine(String command) throws IOException {
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", command);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        line = r.readLine();
        while (line != null) {
            line = r.readLine();
            if (line.contains("Press <Ctrl+C> to exit")) {
                System.out.println(line);
                break;
            }
            System.out.println(line);
        }
    }
}
