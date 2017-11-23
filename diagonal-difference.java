import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        int i = scan.nextInt(); //the matrix dimension
        int [][] arrayMatrix = new int [i][i];
     int sum1=0;
        int sum2=0;

        
      for (int n=0;n<i;n++){   
        for (int m=0;m<i;m++){
            arrayMatrix[n][m]= scan.nextInt();
        }
    }
        
        for (int m=0;m<i;m++){
             sum1+=arrayMatrix[m][m];
        }
           
        int counter=0;
           for (int k=i-1;k>=0;k--){
            sum2+=arrayMatrix[counter][k];
         counter++;
        }
        
     int dif=Math.abs(sum1-sum2);
    System.out.println(dif);
    }
  
}