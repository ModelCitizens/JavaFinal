package test;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		{
		
			int [] values = {23, 6, 47, 35, 2, 14};
			
			int sum = 0;
			
			int lowest = 100;
			for(int i = 0; i < 6; i = i + 1)
			{
				sum= sum + values[i];
				if(lowest > values[i])
				{
					lowest = values[i];
				}
			}
			System.out.println("The average is " + sum/6);
			System.out.println("The lowest number is " + lowest); 
			
		}

	}
	

}
