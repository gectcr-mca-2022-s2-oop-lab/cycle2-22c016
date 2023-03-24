package cycle2;
import java.util.*;

public class SortArray {

	public static void main(String[] args) {

		int num,i ;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		num= in.nextInt();
		String arrays[]=new String[num];
		System.out.println("Enter elements of array: ");
		arrays[0]=in.nextLine();
		for(i=0;i<num;i++)
		{
			arrays[i]=in.nextLine();
		}
		System.out.print("Original array: ");
		
		for(i=0;i<num;i++)
		{
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		System.out.print("Sorted array: ");
//		System.out.println();
		for(i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arrays[i].compareTo(arrays[j])>0)
	                {  
	                    
                    String temp = arrays[i];  
	                    arrays[i] = arrays[j];  
	                    arrays[j] = temp;  
	                 }  
			}
		}
		
		for(i=0;i<num;i++)
		{
			System.out.print(arrays[i] + " ");
		}

	}

}
   
   