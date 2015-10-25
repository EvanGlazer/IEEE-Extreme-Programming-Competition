import java.io.*;
import java.util.*;

public class Solution {
    
    static Scanner sc = new Scanner(System.in);
    static int gridSize = sc.nextInt();
    public static int grid[][] = new int[gridSize][gridSize];
    static int stringLength;
    static char characters[];
    public static int player1[][] = new int[gridSize][gridSize];
    public static int  player2[][] = new int[gridSize][gridSize];
    static int dice[] = new int[gridsize *5];
    static String input;
    static int count = 0;
    static int player1Tracker = 1;
    static int player2Tracker = 1;
    static int player1Sum = 1;
    static int player2Sum = 1;
    static boolean gameOver = false;
    
    
    public static void loadGraph()
    {
 
        for(int i = 5; i>0; i--)
         {
            input = sc.next();
            for(int j = 5; j>0; j--)
            {
              characters = input.toCharArray();
              char charData = input.charAt(0);
                
             // System.out.println(charData);
              String temp = Character.toString(charData);
              
                // empty square
                if( temp.compareTo("-") == 0 )    
                {
                   // System.out.println("DEBUG1");
                    player1[i][j] = 0;
                    player2[i][j] = 0;
                   
                    
                }
                // snakes head
                if( temp.compareTo("a") == 0 )
                {
                    player1[i][j] = 1;
                    player2[i][j] = 1;
                    // System.out.println("DEBUG2");
                    
                }
                // if snakes tail
                if( temp.compareTo("b") == 0)
                {
                    player1[i][j] = 2;
                    player2[i][j] = 2;
                    // System.out.println("DEBUG3");
                    
                }
                // if bunny feet
                if( temp.compareTo("1") == 0)
                {
                    player1[i][j] = 3;
                    player2[i][j] = 3;
                     //System.out.println("DEBUG4");
                    
                    
                } 
            }     
        }   
    }
    
    public static void diceData()
    {
        
        while(sc.hasNextInt())
        {
           ++dice[sc.nextInt()];  
        }
        
    }
    public static int rulesCheck()
     {
        int sum = 0;
        // Get dice data, then check
        for(int i=0; i<1; i++)
        {
            if (dice[i] == dice[i+1])
            {
                sum = dice[i]+dice[i+1]+dice[i+2];
                
            }
            sum = dice[i] + dice[i+1];
        
        }
        return sum;
        
    }
    public static void playerCheck(boolean flag)
    {
        
         if(flag == true)
         {
            int player1 = rulesCheck();
            player1Sum += player1;
             
            if(player1 > 5  )
            {
                // equals 4 because that means player is there
                player1Tracker++;
                player1[player1Tracker][sum%5] = 4;
                
                if(player1[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
            else
            {
                 player1[player1Tracker][sum] = 4;
                 if(player1[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
 
        }
        
        if(flag == false)
        {
            int player2 = rulesCheck();
            player2Sum += player2;
            if(player2 > 5  )
            {
                player2Tracker++;
                player2[player2Tracker][sum%5] = 4;
                if(player2[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
            else
            {
                player2[player2Tracker][sum] = 4; 
                if(player2[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
 
        }
        
        // check if other player is on square
        // check if swuare has bunnie or snake on it
        
        
    }

    
    
    
    public static void main(String[] args) {

           loadGraph();
           diceData();
           int player1Turn = 0;
           int player2Turn = 0;
           boolean flag = true;
        
        // player 1 goes first
        if(player1Turn == player2Turn)
        {
            playerCheck(flag);
            flag = false;
        }
        // player 2 goes
        if(player1Turn > player2Turn)
        {
            playerCheck(flag);
            flag = true;
        }
        // player 1 goes
        if(player1Turn < player2Turn)
        {
            playerCheck(flag);
            flag = false;
            
        }
        
        if(gameOver == true)
        {
            System.out.println(player1Sum + player2Sum);
            
        }

    }
}
qwack
import java.io.*;
import java.util.*;

public class Solution {
    
    static Scanner sc = new Scanner(System.in);
    static int gridSize = sc.nextInt();
    public static int grid[][] = new int[gridSize][gridSize];
    static int stringLength;
    static char characters[];
    public static int player1[][] = new int[gridSize][gridSize];
    public static int  player2[][] = new int[gridSize][gridSize];
    static int dice[] = new int[gridsize *5];
    static String input;
    static int count = 0;
    static int player1Tracker = 1;
    static int player2Tracker = 1;
    static int player1Sum = 1;
    static int player2Sum = 1;
    static boolean gameOver = false;
    
    
    public static void loadGraph()
    {
 
        for(int i = 5; i>0; i--)
         {
            input = sc.next();
            for(int j = 5; j>0; j--)
            {
              characters = input.toCharArray();
              char charData = input.charAt(0);
                
             // System.out.println(charData);
              String temp = Character.toString(charData);
              
                // empty square
                if( temp.compareTo("-") == 0 )    
                {
                   // System.out.println("DEBUG1");
                    player1[i][j] = 0;
                    player2[i][j] = 0;
                   
                    
                }
                // snakes head
                if( temp.compareTo("a") == 0 )
                {
                    player1[i][j] = 1;
                    player2[i][j] = 1;
                    // System.out.println("DEBUG2");
                    
                }
                // if snakes tail
                if( temp.compareTo("b") == 0)
                {
                    player1[i][j] = 2;
                    player2[i][j] = 2;
                    // System.out.println("DEBUG3");
                    
                }
                // if bunny feet
                if( temp.compareTo("1") == 0)
                {
                    player1[i][j] = 3;
                    player2[i][j] = 3;
                     //System.out.println("DEBUG4");
                    
                    
                } 
            }     
        }   
    }
    
    public static void diceData()
    {
        
        while(sc.hasNextInt())
        {
           ++dice[sc.nextInt()];  
        }
        
    }
    public static int rulesCheck()
     {
        int sum = 0;
        // Get dice data, then check
        for(int i=0; i<1; i++)
        {
            if (dice[i] == dice[i+1])
            {
                sum = dice[i]+dice[i+1]+dice[i+2];
                
            }
            sum = dice[i] + dice[i+1];
        
        }
        return sum;
        
    }
    public static void playerCheck(boolean flag)
    {
        
         if(flag == true)
         {
            int player1 = rulesCheck();
            player1Sum += player1;
             
            if(player1 > 5  )
            {
                // equals 4 because that means player is there
                player1Tracker++;
                player1[player1Tracker][player1Sum%5] = 4;
                itemDetection();
                if(player1[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
            else
            {
                 player1[player1Tracker][player1Sum%5] = 4;
                itemDetection();
                 if(player1[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
 
        }
        
        if(flag == false)
        {
            int player2 = rulesCheck();
            player2Sum += player2;
            if(player2 > 5  )
            {
                player2Tracker++;
                itemDetection();
                player2[player2Tracker][player2Sum%5] = 4;
                if(player2[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
            else
            {
                player2[player2Tracker][player2Sum%5] = 4; 
                itemDetection();
                if(player2[gridSize][gridSize] = 4)
                {   
                    gameOver = true;
   
                }   
            }
 
        }
        
        // check if other player is on square
        if (player1[player1Tracker][player1Sum%5] == 4 && player2[player2Tracker][player2Sum%5] == 4)
         {
            
            
            
        }
        // check if swuare has bunnie or snake on it
        
        
    }

    public static void itemDetection()
    {
 
        
        // snakes head scenario
        if(player1[player1Tracker][player1Sum%5] == 1)
        {
            
        }
        if(player2[player2Tracker][player2Sum%5] == 1) 
        {
            
        }
        
         // snakes tail scenario
        if(player1[player1Tracker][player1Sum%5] == 2)
        {
            
        }
        if(player2[player2Tracker][player2Sum%5] == 2) 
        {
            
        }
        
        // bunnies feet  scenario
        if(player1[player1Tracker][player1Sum%5] == 3)
        {
            
        }
        if(player2[player2Tracker][player2Sum%5] == 3) 
        {
            
        }
          
        
    }
    
    
    public static void main(String[] args) {

           loadGraph();
           diceData();
           int player1Turn = 0;
           int player2Turn = 0;
           boolean flag = true;
        
        // player 1 goes first
        if(player1Turn == player2Turn)
        {
            playerCheck(flag);
            flag = false;
        }
        // player 2 goes
        if(player1Turn > player2Turn)
        {
            playerCheck(flag);
            flag = true;
        }
        // player 1 goes
        if(player1Turn < player2Turn)
        {
            playerCheck(flag);
            flag = false;
            
        }
        
        if(gameOver == true)
        {
            System.out.println(player1Sum + player2Sum);
            
        }

    }
}