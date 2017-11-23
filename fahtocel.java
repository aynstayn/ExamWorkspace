package h10;

import java.util.Scanner;

public class fahtocel {
	
	public static double celdenfah (double cel) {
		double fah;
		fah = (9.0 / 5) * cel + 32;
		return fah;
	}
	public static double fahdancel ( double fah) {
		double cel;
		cel = (5.0/9) * (fah - 32);
		return cel;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// verileri yarat
		double kulcel, kulfah, hesapcel, hesapfah;
		
		// deger al
		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen cel degeri giriniz: ");
		kulcel = input.nextDouble();

		// gerekli metodu cagir
		hesapfah = celdenfah(kulcel);
		System.out.println(" cel = " + kulcel + " = " + hesapfah);
		
		
		// kullanýcýdan fah oku
		System.out.println("Lutfen fah degeri giriniz: ");
		kulfah = input.nextDouble();
		
		// metodu cagir
		
		kulcel = fahdancel(kulfah);
		System.out.println("fah = " + kulfah + " = " + kulcel + " cel");
		
	}

}
