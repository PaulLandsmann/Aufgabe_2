package h3;

public class H3_main {

	public static void main(String[] args) {
		
		
		int i = 20;
		int j = 103;
		int k = -10;
		
		boolean A1 = i > j;
		boolean A2 = i > 200;
		boolean A3 = j > 100;
		
		
		if(A1 == true && A2 == false && A3 == false) {
			k = 1;
		}
		
		if(A1 == true && A2 == true && A3 == false) {
			k = 2;
		}
		
		if(A1 == true && A2 == true && A3 == true) {
			k = 3;
		}
		
		if(A1 == false && A2 == false && A3 == false) {
			k = 4;
		}
		
		System.out.println("Ausdruck 1: " + A1);
		System.out.println("Ausdruck 2: " + A2);
		System.out.println("Ausdruck 3: " + A3);
		System.out.println("k = " + k);
	}

}
