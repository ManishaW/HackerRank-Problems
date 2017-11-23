import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long [] arrayToSort={a,b,c,d,e};
        
//sort array 
         Arrays.sort(arrayToSort);
        long min=0;
        long max=0;
     for (int k=0;k<4;k++){
         min+=arrayToSort[k];
     }
    for (int m=4;m>0;m--){
         max+=arrayToSort[m];
     }
     System.out.println(min+" "+max);
        
    }
}
