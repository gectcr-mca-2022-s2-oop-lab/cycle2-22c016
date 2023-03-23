package cycle2;

import java.util.*;

public class SearchElement {

	public static void main(String args[]) {
		int num, x, flag = 0, i;

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");

		num = inp.nextInt();
		int a[] = new int[num];

		System.out.println("Enter elements:");
		for (i = 0; i < num; i++) {
			a[i] = inp.nextInt();
		}
		
		System.out.println("The elements are:");
		for (i = 0; i < num; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println();

		System.out.println("Enter the element you want to search:");
		x = inp.nextInt();
		for (i = 0; i < num; i++) {
			if (a[i] == x) {
				flag = 1;
				break;
			}

			else {
				flag = 0;
			}
		}

		if (flag==1) {
			System.out.println("Element found in array.");
		} else {
			System.out.println("Element not found");
		}
	
	}
}
