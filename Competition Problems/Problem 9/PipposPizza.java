import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext())
        {
            int numCuts = sc.nextInt();
            
            if(numCuts == 1)
            {
                System.out.println("3");
            }
            else if(numCuts == 2)
            {
                System.out.println("4");
            }
            else
            {
                int i = 5;
                int j = 1;
                do
                {
                    if( (i*j) == numCuts )
                    {
                        System.out.println(i);
                        break;
                    }
                    i++;
                    j++;
                }while(true);
            }
        }
    }
}