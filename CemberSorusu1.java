import java.util.Scanner;

/**
 * 
 */

/**
 * @author Atakan Akdıkan
 *
 */
public class CemberSorusu1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// X VE Y GIRILEN CEMBERIN ICINDE MI DISINDA MI
		  
		Scanner input = new Scanner(System.in);

	        System.out.print("X ve Y lokasyonlarını girin: ");
	        double x = input.nextDouble();
	        double y = input.nextDouble();

	        if (Math.pow(x * x + y * y, 0.5D) <= 10.0) {
	            System.out.println("(" + x + ", " + y + ") DAİRE icinde");
	        } else {
	            System.out.println("(" + x + ", " + y + ") Daire dısında");
	        }

	}

}
