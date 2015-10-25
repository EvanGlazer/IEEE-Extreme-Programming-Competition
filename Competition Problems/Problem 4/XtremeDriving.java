
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static Scanner sc = new Scanner(System.in);
    public static final int lanes = 4;
    public static int length = sc.nextInt();
    public static final int numCows = sc.nextInt();
    public static int cowXY[][] = new int[lanes + 1][numCows + 1];
    public static int numWays = 0;
    
    public static void loadCow()
    {
        try
        {   
            for(int i = 0; i < numCows; i++)
            {
                cowXY[0][i] = 0;
                cowXY[1][i] = 0; 
                cowXY[2][i] = 0; 
                cowXY[3][i] = 0; 
            }  
            while(sc.hasNextInt())
            {
                cowXY[sc.nextInt()][sc.nextInt()] = 1;  
            }            
        }
        // if theres error read in differently
        catch(Exception e)
        {
            e.printStackTrace();     
        }
    }
    
    public static void minimax(int x, int y)
    {
        int carX = x;
        int carY = y;
                
        if(carY < length - 3)
        {
            if(carX == 1)
            {
                carY++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                carX++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
            }
            else if(carX == 4)
            {
                carY++;
                carX--;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                carX++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
            }
            else
            {
                carY++;
                carX--;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;

                }
                carX++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                carX++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
            }
        }
        else if(carY == length - 3)
        {
            carY++;
            if(carX == 1)
            {
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                else if(cowXY[carX+1][carY] != 1)
                {
                    numWays++;
                    minimax(carX + 1, carY);
                }
            }
            else if(carX == 2)
            {
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                else if(cowXY[carX+1][carY] != 1)
                {
                    numWays++;
                    minimax(carX + 1, carY);
                }
                 else if(cowXY[carX-1][carY] != 1)
                {
                    numWays++;
                    minimax(carX - 1, carY);
                }
            }
            else if(carX == 3)
            {
                carY++;
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                else if(cowXY[carX+1][carY] != 1)
                {
                    numWays++;
                    minimax(carX + 1, carY);
                }
            }
            else
            {
                numWays--;
            }
        }
        else if(carY == length - 2)
        {
            carY++;
            if(carX == 1)
            {
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                else if(cowXY[carX+1][carY] != 1)
                {
                    numWays++;
                    minimax(carX + 1, carY);
                }
            }
            else if(carX == 2)
            {
                if(cowXY[carX][carY] != 1)
                {
                    numWays++;
                    minimax(carX, carY);
                }
                else if(cowXY[carX+1][carY] != 1)
                {
                    numWays++;
                    minimax(carX + 1, carY);
                }
                else if(cowXY[carX-1][carY] != 1)
                {
                    numWays++;
                    minimax(carX - 1, carY);
                }
            }
            else if(carX == 3 && (cowXY[carX-1][carY] != 1))
            {
                numWays++;
                minimax(carX - 1, carY);
            }
            else
            {
                numWays--;
            }
        }
        else if(carY == length - 1)
        {
            carY++;
            if(carX == 1 && (cowXY[carX][carY] != 1))
            {
                numWays++;
                minimax(carX, carY);
            }
            else if(carX == 2 && (cowXY[carX][carY] != 1))
            {
                numWays++;
                minimax(carX - 1, carY);
            }
            else
            {
                numWays--;
            }
        }
        else if(carY == length)
        {
            if(carX != 1)
            {
                numWays--;
            }
        }
    }

    public static void main(String[] args) {
        loadCow();
        minimax(1, 1);
        System.out.println(numWays % (int)( (Math.pow(10, 9) + 7) ) );
    }
}