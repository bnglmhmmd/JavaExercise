package Al�st�rmalar05;

import java.util.Scanner;

public class GirilenSayilariToplama {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Toplamak istedi�iniz say�y� giriniz: (��kmak i�in 0 giriniz) " );
		int sayi = giris.nextInt();
		
		int toplam = 0;
		
		while(sayi != 0) {

			toplam += sayi;
			System.out.println("Toplamak istedi�iniz say�y� giriniz: (��kmak i�in 0 giriniz) " );
			sayi = giris.nextInt();
			
			
			
		}
		System.out.println("Toplam: " + toplam);
		
		
	}

}
