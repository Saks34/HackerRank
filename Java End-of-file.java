import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int l=1;
         while (s.hasNextLine()) {
            String line = s.nextLine(); // Read the next line of input
            
            // Print line number and the content of the line
            System.out.println(l + " " + line);
            
            l++; // Increment the line number for the next iteration
        }
    }
}
