import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] b = new int[m];
        
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        
        int rangeStart=lcm(a);
        int rangeEnd=gcd(b);
        int counter=1;
        int totalx=0;
        int product=0;

        while ((product<=rangeEnd)){
            product= (rangeStart*counter);
            
            if (rangeEnd%product==0){
                totalx++;
            }

            counter++; 
        }                                      
        
        System.out.println(totalx);

    }
        //find lcm in A
        private static int lcm(int[] input){
        int result = input[0];
        
        for(int i = 1; i < input.length; i++){
             result = lcm2(result, input[i]);
        }

        return result;
        }
    
    private static int lcm2(int a, int b){
        return a * (b / gcd2(a, b));
    }

        
    //find gcf in B

    private static int gcd(int[] input){
    int result = input[0];

    for(int i = 1; i < input.length; i++){
        result = gcd2(result, input[i]);
    } 
    
    return result;
    }  
    
    private static int gcd2(int a, int b){
        while (b > 0)
        {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}