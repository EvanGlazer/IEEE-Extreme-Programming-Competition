import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] canvas = new int[rows][cols];
        
        int numOperations = sc.nextInt();
        
        for(int i = 0; i < numOperations; i++)
        {
            sc.nextLine();
            char op = sc.next().charAt(0);
            
            int row1 = sc.nextInt() - 1;
            int col1 = sc.nextInt() - 1;
            int row2 = sc.nextInt() - 1;
            int col2 = sc.nextInt() - 1;
            
            switch(op)
            {
                case 'a':
                {
                    for(int j = row1; j <= row2; j++)
                    {
                        for(int k = col1; k <= col2; k++)
                        {
                            canvas[j][k]++;
                        }
                    }
                    break;
                }
                case 'r':
                {
                    for(int m = row1; m <= row2; m++)
                    {
                        for(int n = col1; n <= col2; n++)
                        {
                            canvas[m][n]--;
                        }
                    }
                    break;
                }
                case 'q':
                {
                    int sum = 0;
                    for(int r = row1; r <= row2; r++)
                    {
                        for(int s = col1; s <= col2; s++)
                        {
                            sum += canvas[r][s];
                        }
                    }
                    System.out.println(sum);
                    break;
                }
                default:
                {
                    System.out.println(0);
                }
            }
        }
    }
}