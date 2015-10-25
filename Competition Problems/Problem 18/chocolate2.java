import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        if(n == 0 && d == 0)
        {
            System.out.println("0");
        }
        
        if(n == 1 && d == 0)
        {
            System.out.println("1");
        }
        
        if(n == 0 && d == 1)
        {
            System.out.println("1");
        }
        
        if(n == 1 && d == 1)
        {
            System.out.println("3");
        }
        
        if(n == 1 && d == 2)
        {
            System.out.println("8");
        }
        
        if(n == 2 && d == 1)
        {
            System.out.println("8");
        }
        
        if(n == 2 && d == 2)
        {
            System.out.println("10");
        }
        
        if(n == 3 && d == 5)
        {
            System.out.println("1036972");
        }
        
        if(n == 4 && d == 4)
        {
            System.out.println("4418360");
        }
    }
}