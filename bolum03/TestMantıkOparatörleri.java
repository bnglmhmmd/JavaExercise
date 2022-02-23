package bolum3Alýstýrmalar;

import java.util.Scanner;

public class TestMantýkOparatörleri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		
		int sayi = input.nextInt();
		
		if(sayi % 2 == 0 && sayi % 3 == 0) {
			System.out.println("Girilen sayi 2 ve 3 e tam bölünüyor.");
		}if(sayi % 2 == 0 || sayi % 3 == 0) {
			System.out.println("Girilen sayi 2 veya 3 e tam bölünüyor.");
		}if(sayi % 2 == 0 ^ sayi % 3 == 0) {
			System.out.println("Girilen sayi 2 veya 3 e bölünüyor fakat ikisine birden bölünmüyor.");
		}
		
		

	}

}
