package cycle2;
import java.util.Arrays;
import java.util.Scanner;

class StringManipulation{
    String str;
	static Scanner sc = new Scanner(System.in);


    StringManipulation(String str) {
        this.str = str;
    }

    void manipulationMethods(){
        String value = this.str;
        System.out.println( " String Length is : " + value.length());
        
        System.out.println(" Enter an alphabet to find its index:");
        System.out.println("Index: " + value.indexOf(sc.next()));
        
        System.out.println(" Enter the position to find the character there:");
        System.out.println("Character at position: " + value.charAt(sc.nextInt()));
        
        System.out.println(" Enter a string to concatenate with input:");

        System.out.println("Concatenating 'hello' with input : " +value.concat(sc.next()));
        
        System.out.println(" enter a string to compare with input:");
        System.out.println("Comparison: " + value.compareTo(sc.next()));
        
        System.out.println(" enter a string to check if it is equal to input:");
        System.out.println("equals?  " + value.equals(sc.next()));
        
        System.out.println("Enter a string to check if it is contained in the input:");
        System.out.println("Contains ? "+ value.contains(sc.next()));


        
        System.out.println( "Conversion to LowerCase: " + value.toLowerCase());
        System.out.println( "Conversion to UpperCase: " + value.toUpperCase());
    }

    public static void main(String []args) {
    	System.out.println("Enter a string:");
    	StringManipulation str = new StringManipulation(sc.nextLine());
    	str.manipulationMethods();
    }
}