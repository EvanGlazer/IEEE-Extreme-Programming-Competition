import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findRepLength(int length, String str)
    {
        if(length == str.length())
        {
            return length;
        }
        else if(str.length() <= 3)
        {
            return str.length();
        }
        else
        {
            int temp = length;
            for(int i = 0; i < str.length()-length; i+=length)
            {
                String part1 = new String(str.substring(0, length));
                String part2 = new String(str.substring(i, i+length));
                if(part1.compareTo(part2) != 0)
                {
                    temp = findRepLength(length+1, str);
                    break;
                }
            }
            return temp;
        }
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numTests = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < numTests; i++)
        {
            String originalString = sc.nextLine();
            
            if(originalString.length() == 0)
            {
                System.out.println(0);
                break;
            }
            
            int repLength = findRepLength(1, originalString);
            
            System.out.println(repLength);
        }
    }
}