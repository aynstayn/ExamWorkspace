import java.util.Scanner;
/**
 * 
 */

/**
 * @author Atakan Akdıkan
 *
 */
public class palindrone {

	Scanner input = new Scanner(System.in);
    
	System.out.println("Uc haneli sayi gir: ");
	int number = input.nextInt();

	if (number / 100 == number % 10)
	    System.out.println(number + " is a palindrome");
	else 
	    System.out.println(number + " is not a palindrome");
}
}

