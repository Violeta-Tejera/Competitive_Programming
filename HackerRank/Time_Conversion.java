import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int strlen = s.length();
        char mode = s.charAt(strlen - 2);

        if (mode == 'P') {
            int hour = Integer.parseInt(s.substring(0, 2));
            
            if (hour != 12) {
                hour += 12;
            }
            
            String newHour = String.valueOf(hour);
            
            s = newHour + s.substring(2, strlen - 2);
        } else {
            if (s.charAt(0) == '1' && s.charAt(1) == '2') {
                s = "00" + s.substring(2, strlen - 2);
            }
        }

        return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
