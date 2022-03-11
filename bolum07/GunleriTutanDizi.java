package Alistirmalar07;

import java.util.Scanner;

public class GunleriTutanDizi {
	public static void main(String[] args) {
		
		String[] gunler = {"Pazartesi", "Sali", "Çarsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"};
		System.out.println("Hafatnin gununu belirlemek için 1 ile 7 arasinda bir sayi giriniz:");
		
		Scanner klavye  = new Scanner(System.in);
		int secim = klavye.nextInt();
		System.out.println("Sectiginiz gun: " + gunler[secim - 1]);
		
		
		
	}

}
