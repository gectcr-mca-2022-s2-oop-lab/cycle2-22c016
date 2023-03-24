package cycle2;

import java.util.Scanner;

public class ArraySum {

	public static void main(String args[]) {
		int num,sum=0, i;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");

		num = in.nextInt();
		int a[] = new int[num];

		System.out.println("Enter elements:");
		for (i = 0; i < num; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println("The elements are:");
		for (i = 0; i < num; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println();
		
		for (int num1: a) {
			  sum = sum+num1;
			}
		System.out.println("Sum is "+sum);
	
	}
}
