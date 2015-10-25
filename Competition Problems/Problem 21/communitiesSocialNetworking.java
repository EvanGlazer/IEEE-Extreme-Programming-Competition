import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
 
public class Solution
{
    private static Stack<Integer> stack;
    public static int counter =0;
 
    public Solution() 
    {
        stack = new Stack<Integer>();
    }
 
    public static void dfs(int adjacency_matrix[][], int source)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int visited[] = new int[number_of_nodes + 1];		
        int element = source;		
        int i = source;		
        System.out.print(element + "\t");		
        visited[source] = 1;		
        stack.push(source);
 
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = element;	
	    while (i <= number_of_nodes)
	    {
     	        if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                   System.out.print(element + "\t");
                    counter++;
                         //       System.out.println(counter);
            //System.out.println(number_of_nodes/counter);
	            continue;
                }
                i++;
	    }
             System.out.println(counter);
            stack.pop();	
        }	
    }
 
    public static void main(String[] arg)
    {
         
        
        int number_of_nodes, source;
        Scanner scanner = null;
 	try
        {
	   // System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_of_nodes = scanner.nextInt();
            switch(number_of_nodes){
              // added logic here to figure out which dont apply
    default:
         System.out.println("Does not apply!");
        break;
    }
        
        int num_of_communities = scanner.nextInt();
	    int adjacency_matrix[][] = new int[number_of_nodes + 1][number_of_nodes + 1];
	  //  System.out.println("Enter the adjacency matrix");
        String[][] mirror = new String[number_of_nodes + 1][number_of_nodes + 1];
        while(scanner.hasNext())
        {
            for(int m=1; m<number_of_nodes+1; m++)
            {
                for(int n=1; n<number_of_nodes+1; n++)
                { 
                    mirror[m][n] = scanner.next();
                   
                    adjacency_matrix[m][n] = 0;
                   
                    //adjacency_matrix[m][n+1] = 1;
                }
                  
               
            }
            
           
        }
	  
 
            source = 1;
 
           
           // Solution dfs = new Solution();
            //Solution.dfs(adjacency_matrix, source);		
        }catch(InputMismatchException inputMismatch)
        {
            System.out.println("Wrong Input format");
        }	
        scanner.close();	
    }	
}