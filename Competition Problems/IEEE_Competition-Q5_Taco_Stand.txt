import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int makeTacos(int t, int m, int r, int b, int numTacosMade)
    {        
        int numTacos = numTacosMade;
        
        if(t <= 0)
        {
            return numTacosMade;
        }
        else
        {
            numTacosMade++;
        }
        
        if( (m > 0) && (r > 0) )
        {
            int temp = makeTacos(t-1, m-1, r-1, b, numTacosMade);
            numTacos = (numTacos > temp) ? numTacos : temp;
        }
        
        if( (m > 0) && (b > 0) )
        {
            int temp = makeTacos(t-1, m-1, r, b-1, numTacosMade);
            numTacos = (numTacos > temp) ? numTacos : temp;
        }
        
        if( (r > 0) && (b > 0) )
        {
            int temp = makeTacos(t-1, m, r-1, b-1, numTacosMade);
            numTacos = (numTacos > temp) ? numTacos : temp;
        }
        
        return numTacos;
    }
    
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int maxTacos = 0;
        int n = sc.nextInt();
        
		for(int i = 0; i < n; n++)
        {
            int shells = sc.nextInt();
            int meat = sc.nextInt();
            int rice = sc.nextInt();
            int beans = sc.nextInt();
            
            maxTacos = makeTacos(shells, meat, rice, beans, 0);
            
            System.out.println(maxTacos);
        }
	}
}