package cycle2;
import java.util.*;
public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println("String Methods");
		int choice;
		do {
			System.out.println("1.UpperCase");
			System.out.println("2.LowerCase");
			System.out.println("3.Length");
			System.out.println("4.Replace");
			System.out.println("5.Concat");
			System.out.println("6.Equals");
			System.out.println("0.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println(str.toUpperCase());
					break;
			case 2:System.out.println(str.toLowerCase());
					break;
			case 3:System.out.println("length="+str.length());
			break;
			case 4:System.out.println("Enter the character to be replaced");
					char c=sc.next().charAt(0);
					System.out.println("Enter the new character ");
					char ch=sc.next().charAt(0);
					System.out.println(str.replace(c, ch));
					break;
			case 5:System.out.println("Enter the string to be appended");
					String s=sc.next();
					System.out.println(str.concat(s));
					break;
			case 6:System.out.println("Enter the second string");
			String s1=sc.next();
			System.out.println(str.equals(s1));
			break;
			
			case 0:break;
			}
		}
			while(choice!=0);
		
	}

}