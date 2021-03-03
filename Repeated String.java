import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int strlen=s.length();
        long q=0,r=0;
        q=n/strlen;
        r= n%strlen;
        long partstr=(r==0)?0:r;
        long aCount=q*getLetterCount(s,s.length())+getLetterCount(s,partstr);
        return aCount;
        }
    public static long getLetterCount(String s, long strlen)
    {
        long count=0;
        for (int i=0;i<strlen;i++)
        {
            if(s.charAt(i)== 'a')
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
