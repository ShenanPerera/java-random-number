package Question2;

import java.util.Random;//import random function

//RandNum class
public class RandNum {
		Random rnd = new Random();		//create an object of random class
		int[][] num = new int[5][5];	//2D array of 25 integers
		int i, j, min, max, total ; 	//declare variables
		double average;
		
		//default constructor
		public RandNum(){
			//store random numbers in array
			for(i = 0; i < 5; i++)
			{
				for(j = 0; j < 5; j++)
				{
					num[i][j] = rnd.nextInt(100);
				}
			}
			
			//initialization
			max = 0;
			min = 101;
			total = 0;
			average = 0.0;
		}
		
		//calculate the minimum, maximum and average of 25 values
		public void calculate() {	
			for (i = 0; i < 5; i++)
			{
				for(j = 0; j < 5; j++)
				{
					//calculate maximum value
					if(max < num[i][j])
					{
						max = num[i][j];
					}
				
					//calculate the minimum value
					if(min > num[i][j])
					{
						min = num[i][j];
					}
					
					//calculate the total
					total = total + num[i][j];
				}
			}		
		}
		
		//method to display the values of array, maximum value, minimum value and average  
		public void display(){
			
			int i, j;
			
			for(i = 0; i < 5; i++)
			{
				for(j = 0; j < 5; j++)
				{
					System.out.print(num[i][j] + "\t");	//display values
				}
				System.out.println();
			}
			
			System.out.println("Maximum value : " + max);	//display maximum value
			System.out.println("Minimum Value : " + min);	//display minimum value
			System.out.println("Average : " + Double.valueOf(total)/25.0);	//calculate average and display
		}
}


