package introjava;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {

		System.out.println("Enter the number :");
		Scanner obj=new Scanner(System.in);
		int number = obj.nextInt();
		int fact =1;
		for (int i=1;i<=number;i++) {
			fact=fact*i;
		
			
		}
		System.out.println("Factoral of "+number +" is: " +fact);
		
    	  obj.close();


      }
}
