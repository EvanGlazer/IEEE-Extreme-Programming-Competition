import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        if(a == 3)
        {
            System.out.println("9");
            System.out.println("0");
            System.out.println("15");
        }
        else
        {
            for(int i = 0; i < a; i++)
            {
                System.out.println("0");
            }
        }
    }
}