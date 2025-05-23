package InterviewPrograms;

import java.util.Scanner;

public class PalindromNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("size of array:");
		int n=sc.nextInt();
		
		int rem=0;
		int rev=0;
		int og=n;

		while(n>0)
		{
			rem=n%10;
			rev= rev*10 +rem;
			n=n/10;
			
		}
		if(og==rev)
		{
			System.out.println(og+" is a palindrom");
		}else
		{
			System.out.println(og+" is not a palindrom");
		}
	}

}
