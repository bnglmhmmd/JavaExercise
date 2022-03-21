package Alistirmalar07;

import java.util.Iterator;
import java.util.Scanner;

public class YaziyiTerseCevir {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir yazi giriniz:");
		String yazi = klavye.nextLine();
		
		char[] yaziDizisi = yazi.toCharArray();
		
		char[] yazininTersi = terseCevir(yaziDizisi);
		
		System.out.println("Girdiginiz yazinin tersi: ");
		System.out.println(yazininTersi);
		
		
		
	}

	public static char[] terseCevir(char[] yaziDizisi) {
		char[] yaziDizisininTersi = new char[yaziDizisi.length];
		
		for (int i = 0, j = yaziDizisi.length - 1; i < yaziDizisininTersi.length; i++, j--) {
			yaziDizisininTersi[j] = yaziDizisi[i];
			
		}
				
	
		
		
		return yaziDizisininTersi;
	}

}
