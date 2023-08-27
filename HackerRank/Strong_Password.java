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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        int minLength = 6;

        for(int i = 0; i < n; i++){
            if(hasDigit == false && Character.isDigit(password.charAt(i)) == true){
                hasDigit = true;
            }else if(hasUpperCase == false && Character.isUpperCase(password.charAt(i)) == true){
                hasUpperCase = true;
            }else if(hasLowerCase == false && Character.isLowerCase(password.charAt(i)) == true){
                hasLowerCase = true;
            }else if(hasSpecialChar == false && isSpecialChar(password.charAt(i)) == true){
                hasSpecialChar = true;
            }
        }
        
        int conditionChars = 0;
        
        if(hasDigit == false) conditionChars++;
        if(hasUpperCase == false) conditionChars++;
        if(hasLowerCase == false) conditionChars++;
        if(hasSpecialChar == false) conditionChars++;
        
        int missingLength = 0;
        if(minLength > n){
            missingLength = minLength - n;
        }
        
        return Math.max(missingLength, conditionChars);
    }
    
    static boolean isSpecialChar(char c){
        Set<Character> specialChars = new HashSet<>();
        specialChars.add('!');
        specialChars.add('@');
        specialChars.add('#');
        specialChars.add('$');
        specialChars.add('%');
        specialChars.add('^');
        specialChars.add('&');
        specialChars.add('*');
        specialChars.add('(');
        specialChars.add(')');
        specialChars.add('-');
        specialChars.add('+');
        
        if(specialChars.contains(c)) return true;
        
        return false;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
