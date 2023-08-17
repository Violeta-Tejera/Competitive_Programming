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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer order = 1;
    
        Integer sumPrimaryDiagonal = getSumPrimaryDiagonal(arr);
        Integer sumSecondaryDiagonal = getSumSecondaryDiagonal(arr);
        
        return Math.abs(sumPrimaryDiagonal-sumSecondaryDiagonal);
    }
    
    private static Integer getSumPrimaryDiagonal(List<List<Integer>> arr){
        Integer dimension = arr.size()-1;
        Integer sum = 0;
        
        for(int i = 0; i <= dimension; i++){
            sum += arr.get(i).get(i); // i == j because we are adding up the primary diagonal! :)
        }
        
        return sum;
    }
    
    private static Integer getSumSecondaryDiagonal(List<List<Integer>> arr){
        Integer dimension = arr.size()-1;
        Integer sum = 0;
        
        for(int i = 0; i <= dimension; i++){
            sum += arr.get(i).get(dimension-i);
        }
        
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
