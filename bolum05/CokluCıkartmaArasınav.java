package Alýstýrmalar05;

import java.util.Scanner;

public class CokluCýkartmaArasýnav {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		int sayac = 0;
		int dogruCevapSayýsý = 0;
		String rapor = "";
		
		
		while(sayac < 5) {
			
			int sayi1 = (int)(Math.random() * 10);
			int sayi2 = (int)(Math.random() * 10);
			
			if(sayi1 < sayi2) {
				int geciciSayi = sayi1;
				sayi1 = sayi2;
				sayi2 = geciciSayi;
			}
			

			System.out.println(sayi1 + " - " + sayi2 + " =?");
			int cevap = klavye.nextInt();
			
			if(sayi1 - sayi2 == cevap) {
				System.out.println("Bildiniz..");
				dogruCevapSayýsý++;
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " dogru\n";
				
				
			}else {
				System.out.println("Bilemediniz.");
				rapor += sayi1 + " - " + sayi2 + " = " + cevap + " yanlis\n";
			}
			sayac++;
			
		}
		System.out.println(sayac + " tane soru soruldu");
		System.out.println(dogruCevapSayýsý + "tane dogru cavap verdiniz.\n");
		System.out.println(rapor);
		
	}

}
