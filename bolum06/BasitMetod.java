package Alýstýrmalar06;

public class BasitMetod {

	public static void main(String[] args) {
		System.out.println("1 den 10 a kadar a sayilarin toplami: " + toplam(1, 10));
		System.out.println("25 den 39 a kadar a sayilarin toplami: " + toplam(25, 39));
		System.out.println("40 dan 78 e kadar a sayilarin toplami: " + toplam(40, 78));

	}

	static int toplam(int sayi1, int sayi2) {
		int toplam = 0;

		for (int i = sayi1; i <= sayi2; i++) {
			toplam += i;
		}
		return toplam;
	}

	static int carp(int sayi1, int sayi2) {
		int carpim = sayi1 * sayi2;

		return carpim;

	}

}
