package controlstatements;

import java.util.Scanner;

public class Whileprgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;int s=0;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;

		
			while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
			
	
					
		}
			System.out.println(s);
			if(s==temp)
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		
		
		

	}

}
