package h3;

public class H3_main {
	public static void main(String[] args) {
		int max = 200; 
		int fix = 89; 
		int wartend = 15;
		boolean istVoll = false;
		
		if (fix <= max) {
			
			while (fix  < max && wartend > 0) {
				fix++;
				wartend--;
				//zur Kontrolle des ersten Wertes:
				//System.out.println(fix + " Personen haben einen Fixplatz bekommen und " + wartend+ " Personen stehen noch auf der Warteliste.");
			}
			//sonst einfach hiermit das Ergebnis ansehen.
			System.out.println(fix + " Personen haben einen Fixplatz bekommen und " + wartend+ " Personen stehen noch auf der Warteliste.");
			
			if (fix != max) {
				int rest = max - fix;
				istVoll = false;
				System.out.println(istVoll);
				System.out.println("Es gibt noch " + rest + " freie Plätze.");
			}
			else {
				istVoll = true;
				System.out.println(istVoll);
				System.out.println("Das Maximum wurde erreicht.");
			}
		}
		else {
				istVoll = true;
				System.out.println(istVoll);
				System.out.println("Es ist überfüllt. Auf der Warteliste stehen noch " + wartend + " Personen.");
		}}}



			
