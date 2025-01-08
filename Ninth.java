package introjava;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
			Scanner my=new Scanner (System.in);
			
			System.out.println("Enter the Age: ");
			int age = my. nextInt( );
			if ( age>60 )
			{
				System.out.println("I m senior cityen");
				
			}
			else {
				System.out.println("Im not senior cityzen");
			}
			my.close();
	}

}
