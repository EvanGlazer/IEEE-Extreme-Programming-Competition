import java.util.*;
import java.awt.*;

public class sol {
	

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numCases = 0;
		int iterate = 0;
		int bookings = 0;
		int dollars = 0;
		
		int array[];
		array = new int[49];
		
		
		numCases = input.nextInt();
		
		while(iterate < numCases)
		{
			bookings = input.nextInt();
			for(int i = 0; i <bookings; i++)
			{
				int start = input.nextInt();
				int end = input.nextInt();
				
				 dollars = input.nextInt();
				if(end < start)
				{
					
				}
				else
				{
					dollars += dollars;
				}
				
				array[i] = start;
				array[i+1] = end;
				
				
								
				
			}
			
			System.out.println(dollars);
		}
	}
}
