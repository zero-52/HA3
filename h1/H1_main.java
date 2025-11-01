package h1;

public class H1_main {
	public static void main(String args[]) {
		double guthaben = -600;
		double monEingang = -700;
		int rating = -1;
		boolean warnhinweis = true;
		boolean negativ = true;
		
		if (guthaben < 0) {
			negativ = true;
		}
		
			else {
				negativ = false;
			}
		
		if (guthaben > 0) {
				rating += 3;
			}
		
		else if (guthaben == 0) {
			rating += 2;
		}
		
		
		if (guthaben < 0 && monEingang >= guthaben) {
			rating += 1;
		}
		
		   else if (guthaben < 0 && monEingang < guthaben) {
			rating -= 1;
		}
		
		if (guthaben < 0 && monEingang < guthaben && rating < 0) {

			warnhinweis = true;
		}  
		   else {
			warnhinweis = false;
			}
		
				
	System.out.println(negativ);
	       System.out.println(rating);
	System.out.println(warnhinweis);
	
	}
}
	

