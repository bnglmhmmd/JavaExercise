package Alýstýrmalar05;

public class HarcHesaplama {
	public static void main(String[] args) {
		
		double harc = 10000;
		
		int yil = 0;
		
		while(harc < 20000) {
			harc *= 1.07;
			yil++;
			
		}
		System.out.printf(yil + " yýl içinde ödeyeceðiniz harc: %.2f olacaktýr.", harc);
	}

}
