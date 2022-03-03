package Alýstýrmalar06;

public class TestRassalKarekter {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(RastgeleKarekter.buyukHarfBul() + " ");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RastgeleKarekter.kucukHarfBul() + " ");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RastgeleKarekter.rakamBul() + " ");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(RastgeleKarekter.herhangiBirKarakterBul() + " ");
		}
		
	}

}
