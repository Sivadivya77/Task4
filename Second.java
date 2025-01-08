package introjava;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner myobj = new Scanner(System.in); 
			System.out.println("Enter the ODD or EVEN number: ");
			int number = myobj.nextInt();
			
			if (number % 2==0) {
				System.out.println("Its an EVEN number: " + number);
			
			}
			else {
				System.out.println("Its an ODD number: " + number);
			}
		}
		}
		
		// TODO Auto-generated method stub

	


