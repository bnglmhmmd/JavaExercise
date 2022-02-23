package Alýstýrmalar05;

import java.util.Scanner;

public class soru17 {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Gireceginiz uçgenin satýr sayýsýný giriniz:");
		
		int SatirSayisi = klavye.nextInt();
		
		for (int i = 0; i < SatirSayisi; i++) {
			 for (int j = SatirSayisi - 1 - i; j > 0; j--) {
				 System.out.print("   ");
				
			}
			for(int j = i + 1; j > 0; j--) {
				System.out.printf("%3d",j);
			}
			for(int j = 2; j < i + 2; j++) {
				System.out.print("  " + j);
			}
			System.out.println();
		}
	}

}
