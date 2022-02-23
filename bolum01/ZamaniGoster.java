package bolum01;

import java.util.Scanner;


public class ZamaniGoster {
	public static void main(String[] args) {
		System.out.println("Saniye cinsinden bir tam sayi giriniz:");
		
		Scanner input = new Scanner(System.in);
		
		int saniye = input.nextInt();
		
		int dakika = saniye / 60;
		
		int KalanSaniye = saniye % 60;
		
		System.out.println(saniye + " Saniye " + dakika + " dakika ve " + KalanSaniye + " saniyedir");
		
		
	}

}
