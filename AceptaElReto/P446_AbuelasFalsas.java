// Source: https://aceptaelreto.com/problem/statement.php?id=446
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P446_AbuelasFalsas
{
	public static void main(String[] args) {
        FastReader fr = new FastReader();
		int surveyed_women = fr.nextInt();

        for(int i = 0; i < surveyed_women; i++){
            String actual_grandchild = fr.next();
            int num_people = fr.nextInt();
            int times_mentioned = 0; // This will count the times the correct grandchild, just in case the woman hesitates (This would mean she's not a grandmother)
            String[] names = new String[num_people];

            for(int j = 0; j < num_people; j++){
                names[j] = fr.next();
                if(names[j].equals(actual_grandchild)) times_mentioned++;
            }

            String lastName = names[num_people-1];
            if(num_people == 1) System.out.println("FALSA"); // She first-guessed correctly. Not a grandmother
            else if(lastName.equals(actual_grandchild) && times_mentioned == 1) System.out.println("VERDADERA"); // She guessed her grandchild's name at the end. Real grandmother
            else System.out.println("FALSA"); // Different false grandmother cases like not ever guessing the name, saying the name more than once,...
        }
	}

    // Code extracted from Geeks for Geeks: https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

