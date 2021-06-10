package Jhalak;
import java.util.Scanner;

public class Armstrong {

	//private static Scanner sc;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check whether it is armstrong no or not ");
		int no=sc.nextInt();
		int t1=no;
		int t2=no;
		int length=0;
		int arm=0;
		int rem;
		
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		
	
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
				
				mul=mul*rem;
			}
			
			arm=arm+mul;
			System.out.println("Arm = "+arm);
			t2=t2/10;
		}
		sc.close();
		if(no==arm)
		{
			System.out.println("Its an armstrong number");
		}
		else
		{
			System.out.println("Its not an armstrong number");
		}
	}
}
