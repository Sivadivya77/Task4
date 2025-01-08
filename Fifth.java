package introjava;

import java.util.Scanner;

public class Fifth {
  public static void main(String[] args) {
		int number;
		int no= 0;
		System.out.println("Enter the number ;");
		Scanner obj = new Scanner(System.in);
		number = obj.nextInt();
		
		if (number==0||number==1) {
			System.out.println(number +"is not prime number");
		}
		else {
			int middleno = number/2;
			for (int i=2;i<=middleno;i++) {
				if (number % i ==0)
				{
					System.out.println( number + " is not prime number");
					no =1;
					break;
					}
			}
			if (no==0) {
				System.out.println(number +"is a prime number");
			}
		}
		
	}

}
