import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt(); //find multiples of k 
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int counter=0;
        
        for (int x=0;x<n;x++){
            for (int y=x+1;y<n;y++){
                if ((a[x]+a[y])%k==0){
                    counter++;
                }
            }
        }
        
        System.out.println(counter);
        
        
        
        
    }
}
