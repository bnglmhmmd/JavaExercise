package Al�st�rmalar05;

public class HarcHesaplama {
	public static void main(String[] args) {
		
		double harc = 10000;
		
		int yil = 0;
		
		while(harc < 20000) {
			harc *= 1.07;
			yil++;
			
		}
		System.out.printf(yil + " y�l i�inde �deyece�iniz harc: %.2f olacakt�r.", harc);
	}

}
