package bolum3Alıstırmalar;

import java.util.Scanner;

public class ArtıkYılHesapla {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir yil giriniz:");
		int yil = input.nextInt();
		
		boolean artikYilMi = yil % 4 == 0;
		
		artikYilMi = artikYilMi && yil % 100 != 0;
		
		artikYilMi = artikYilMi || yil % 400 == 0;
		
		//artikYilMi = (yil % 4 == 0 && yil % 100 != 0) || yil % 400 == 0;
		// BU ŞEKİLDE DE YAZILABİLİR VE DAHA SADE YAZILABİLİR.
		
		if(artikYilMi) {
			System.out.println("Girilen yil artik yildir.");
		}else {
			System.out.println("Girilen yil artik yil degildir.");
		}
		
				

	}

}
