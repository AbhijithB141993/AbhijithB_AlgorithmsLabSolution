package com.greatlearning.labsolution;
import java.util.Scanner;

public class PayMoney {

		
		static Scanner in = new Scanner (System.in);

		public static void main(String[] args) {
					
			int size;
			System.out.println("Enter the size of transaction array");
			size = in.nextInt();
			
			
			int[] tran = new int[size];
					
			// fetch transactions
			System.out.println("Enter the values of transactions");
			for (int i=0;i<size;i++)
			{
				tran[i] = in.nextInt();
			}
			
			//fetch number of targets
			System.out.println("Enter the number of targets");
			int num = in.nextInt();
			
			//fetch how many times number of targets has to be achived
			for (int i=0;i<num;i++)
			{
				// read target from the user
				System.out.println("Enter the target");
				int target = in.nextInt();
				
				int sum = 0; 
				
				int index = 0;
				
				boolean flag = false; //target checking
				
				while(index < tran.length)
				{
					sum+=tran[index];
					index++;
					if(sum>=target)
					{
						flag = true; //target achieved
						break;
					}
				}
				if (flag == true)
					System.out.println("Target achieved after " + index + " transactions");
				else
					System.out.println("Target is not achieved");
			}
				
		}

	}
