package h2;

public class H2_main {
	public static void main(String args[]) {
		int jahr = 1596;
		boolean schalt =  true;
		
		if ( jahr % 4 == 0 ) {
			schalt = true;
			System.out.println (schalt);
			System.out.println ("Das Jahr " + jahr + " ist ein Schaltjahr.");
		}
		
		else {
			schalt = false;
		System.out.println (schalt);
		System.out.println ("Das Jahr " + jahr + " ist kein Schaltjahr.");

		}
	}

}
