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
     * Complete the 'handshake' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int handshake(int n) {
        /*
        Explanation: We have n attendees and if we start counting the handshakes each
        of them execute, we have n-1 hanshakes for the first attendee,
        n-2 handshakes for the second one,... 
        
        German mathematician Carl F. Gauss realized that the sum of all numbers
        until a certain N is indeed the result of the following expression:
        
        (N-1)*(N/2)
        
        Therefore, that's why this is the solution for this function, in O(1) time.
        Because we are just counting all numbers from 1 to N (backwards).
        */
        
        return ((n-1) * n) / 2;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.handshake(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
