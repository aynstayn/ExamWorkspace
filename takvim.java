package h10;
import java.util.Scanner;
public class takvim {
	

	
	public static int ayoku () {
		System.out.println("ay giriniz: ");
		Scanner input = new Scanner (System.in);
		int ay = input.nextInt();
		return ay;
	}
	public static int seneoku () {
		System.out.println("sene giriniz: ");
		Scanner input = new Scanner (System.in);
		int sene = input.nextInt();
		return sene;
	}
	public static void ayBas(int sene, int ay) {
		aybaslikbas(sene, ay);
		ayinIcbas(ay);
	}
	public static void aybaslikbas(int sene , int ay) {
		String ayinismi = ayinIsmiNe(ay);
		System.out.println("\t\t" + ayinIsmi + "\t" )
	}
	public static void ayIcbas (int ay) {
		
	}
	public static String ayinIsmiNe (int ay) {
		String ayinIsmi;
		switch(ay)
		case (1): ayinIsmi = "Ocak"; break;
		case (2)  ayinIsmi = "Subat"; break;
		
		// devam ettir.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kul veri al
		int sene, ay;
		
		// kul sene ve ay al
		
	}

}
