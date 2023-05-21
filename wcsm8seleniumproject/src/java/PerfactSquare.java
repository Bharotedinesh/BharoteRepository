package java;

import java.util.Scanner;

public class PerfactSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		double number = sc.nextDouble();
		if (checkPerfectSquare(number))
		
			System.out.println("Yes the given number is perfect square");
		
		else 
		
			System.out.println("no the given number is  not perfect square");
		
	}

	static boolean checkPerfectSquare(double number) {
		// TODO Auto-generated method stub
		for(int i=1;i*i<=number;i++)
		{
			if((number%i==0)&&(number/i==i)) 
			{
				return true;
            }
		}
		 return false;
	}

}
