package h10;

public class overloadexer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mainenbuyuk = enbuyukbul (1,2.0);
		System.out.println("en buyuk " + mainenbuyuk);
	}
public static double enbuyukbul(int n1, double n2) {
	if ( n1 > n2)
		return n1;
	else
		return n2;
}
public static double enbuyukbul(double n1, int n2) {
	if ( n1 > n2)
		return n1;
	else
		return n2;
}
}
