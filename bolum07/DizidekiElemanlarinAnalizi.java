package Alistirmalar07;

import java.util.Scanner;

public class DizidekiElemanlarinAnalizi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Ortalama almak için kaç sayi girmak istiyorsunuz? ");
		
		int donguSayisi = giris.nextInt();
		
		double toplam = 0;
		double[] dizi = new double[donguSayisi];
		
		for (int i = 0; i < donguSayisi; i++) {
			System.out.println("Lutfen bir sayi giriniz:");
			dizi[i] = giris.nextDouble();
			
			toplam += dizi[i];
		}
		
		double ortalama = toplam / donguSayisi;
		System.out.println("ortalama: " + ortalama);
		
		double ortalamadanBuyuklerinSayacı = 0;
		
		for (int i = 0; i < donguSayisi; i++) {
			if(dizi[i] > ortalama) {
				ortalamadanBuyuklerinSayacı++;
				
			}
		}
		System.out.println(ortalamadanBuyuklerinSayacı + " tane sayi ortalamadan buyuktur. ");
		
		
	}

}
