package org.java;

public class Java {
	public static void main(String[] args) {
		// number is odd or even
		/*
		 * int n=167; if(n%2==0) { System.out.println("even"); } else {
		 * System.out.println("odd"); }
		 */

		// print the even numbers between 1 to 100
	/*	for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even number" + i);
			}}*/
/*			// print the even numbers between 1 to 100
		int count=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				count++;
			//	System.out.println("odd number" + i);
			}
		}
	System.out.println(count);
	*/
	
/*	
	//factoril
		int fact=1;
		for (int i = 1; i <=5; i++) {
			fact=fact*i;
			
		}
		
		System.out.println(fact);	*/
	/*//reverse
		int num=12345;
		int rem=0;
		int rev=0;
		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
	System.out.println(rev);*/
		//palindrome
		
		int num=156;
		int rem=0;
		int rev=0;
		int n=num;
		
		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
	System.out.println(rev);
	if(rev==n) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindorme");
	}
	}
}
