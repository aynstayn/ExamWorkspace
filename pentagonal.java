package h10;

public class pentagonal {

	

	public static int pentagonalsayż(int n){
        return (n*(3*n-1))/2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.out.println("100 sayż gir: ");
		 for (int i = 1; i < 101; i++){
			 System.out.printf("%7d ", pentagonalsayż(i));
			 if (i % 10 == 0)
		                System.out.println();
		        }
		    }

		    
	}


