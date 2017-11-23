import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double v1 = in.nextDouble(); 
        double x2 = in.nextDouble();
        double v2 = in.nextDouble();
        
    // the information givens allows to build two linear graphs, check for an intersection to see if they ever meet??
        
        if (v1==v2){ //if the lines are parallel they'll never meet 
            System.out.println("NO");
            System.exit(0); 
        }
       
        else if ((x1>x2)&&(v1>v2)){ //they'll intersect in the neg quad; therefore wont really meet
            System.out.println("NO");
            System.exit(0); 
        }
           else if ((x1<x2)&&(v1<v2)){ //they'll intersect in the neg quad; therefore wont really meet
            System.out.println("NO");
            System.exit(0); 
        }
        
        double root=0;
        double intersection=0;
        root=(Math.abs(x1-x2))/(v1-v2);
        intersection= v1*(root)+x1;
        
        if ((((intersection-x1)%v1)==0)&&(((intersection-x2)%v2)==0)){
            System.out.println("YES");
        }
        else{
              System.out.println("NO");
        }
       
}
}