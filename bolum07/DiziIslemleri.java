package Alistirmalar07;

import java.util.Iterator;
import java.util.Scanner;

public class DiziIslemleri {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		/*
		final int diziUzunlugu = 5;
		int[] dizi = new int[diziUzunlugu];
		System.out.println("Lutfen " +  diziUzunlugu  + " tane sayi giriniz:"  );
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = klavye.nextInt();
		}
		*/
		System.out.println("------------------------------------------------------------");
		
		// dizi elemanlarini yazdir
		int[] dizi2 = new int[100]; 
		for (int i = 0; i < dizi2.length; i++) {
			dizi2[i] = (int)(Math.random() * 100);
			System.out.printf("%3d", dizi2[i]);
			if((i+1) % 20 == 0) {
				System.out.println();
			}
			
		}
		// dizinin elemanlarinin toplamý yapilirken
		int toplam = 0;
		for (int i = 0; i < dizi2.length; i++) {
			toplam += dizi2[i];
		
		}
		System.out.println("Dizi2 nin elemanlarrinin toplami: " + toplam);
		
		// string dizisi olusturulurken izlenilen yol 
		char[] city  = {'D', 'a', 'l', 'l', 'a', 's'};
		System.out.println(city);
		
		//dizinin en buyuk elemaný bulunurken
		int enBuyukEleman = 0;
		int enBuyukElemaninEnKucukIndexsi = 0;
		for (int i = 0; i < dizi2.length; i++) {
			if(enBuyukEleman < dizi2[i]) {
				enBuyukEleman = dizi2[i];
				enBuyukElemaninEnKucukIndexsi = i;
			}
		}
		System.out.println("Dizideki en buyuk eleman: " + enBuyukEleman + "dir");
		
		// Bir dizideki elemalari rassal olarak karistirma
		for (int i = 0; i < dizi2.length; i++) {
			int rassalIndex = (int)(Math.random() * dizi2.length);
			int gecici = dizi2[i];
			dizi2[i] = dizi2[rassalIndex];
			dizi2[rassalIndex] = gecici;
		}
		for (int i = 0; i < dizi2.length; i++) {
			System.out.printf("%3d", dizi2[i]);
			if((i+1) % 20 == 0) {
				System.out.println();
			}
		}
		
		
				
		
		
		
		
		
	}

}
