package Input_Output;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    public void inputOutput() throws IOException {
        BufferedReader stdin;
        String line;
        double sum, d = 0.0;
        int i = 0;
        stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input a double: ");
        System.out.flush();
        if ((line = stdin.readLine()) != null) {
            d = Double.valueOf(line).doubleValue();
        }
        System.out.print("Input an int: ");
        System.out.flush();
        if ((line = stdin.readLine()) != null)
            i = Integer.valueOf(line).intValue();
        sum = d + i;
        System.out.println("Their sum is " + sum + ".");

    }

}
