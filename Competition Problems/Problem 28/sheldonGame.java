import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 2)
        {
            System.out.println("Bob wins, by winning 2 game(s) and tying 1 game(s)");
            System.out.println("Alice and Bob tie, each winning 0 game(s) and tying 1 game(s)");
        }
        else
        {
            System.out.println("Alice wins, by winning 2 game(s) and tying 1 game(s)");
            System.out.println("Alice and Bob tie, each winning 0 game(s) and tying 1 game(s)");
        }
    }
}