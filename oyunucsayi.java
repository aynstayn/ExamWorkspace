import java.util.Scanner;
/**
 * 
 */

/**
 * @author Atakan Akdıkan
 *
 */
public class oyunucsayi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int rastgelesayi = (int) (Math.random() * 1000);
		   
		   System.out.println("sayilarin toplamini giriniz " + rastgelesayi);
		   Scanner input = new Scanner(System.in);
		   int kullsayi = input.nextInt(); 
		   
	   
		   int yuzluk = rastgelesayi / 100;
		   int  ondalik = (rastgelesayi %100) / 10;
		   int birlik = (rastgelesayi%100) % 10; 
		   int toplam = yuzluk + ondalik + birlik;
		   
		   if (toplam == kullsayi)
			   System.out.println("dogru");
		   else
			   System.out.println("yanlis");
	}

}
