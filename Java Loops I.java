import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b;
        for(int i=1;i<11;i++){
            b=a*i;
            System.out.println(a+" x "+i+" = "+b);
        }
    }
}
