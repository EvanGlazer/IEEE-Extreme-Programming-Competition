import java.io.*;
import java.util.*;

public class Solution {
    static int counter = 1;
    
    public static int recursiveDigits(double num)
    {
        
       // String convert = Double.toString((int) num);
        Double d = num;
        int length;
        if(num>66000)
        {
            String convert = Double.toString(num);
            length = convert.length() - 2;
        }
        else{
        String[] splitter = d.toString().split("\\.");
        int a = splitter[0].length();   // Before Decimal Count
        int b = splitter[1].length();
        //int c = Integer.parseInt(splitter[1]);// After  Decimal Count
        if(b == 1 )
         {
            length = a;
        }
        else{
             length = a+b;
        }
        }
        
        if(num == length) {   
            return counter;
        }
        
        counter++;

        return recursiveDigits((double) length);

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble())
        {
            System.out.println(recursiveDigits(sc.nextDouble()));
            counter = 1;
        }
}
}