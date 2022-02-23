package Alýstýrmalar04;

import java.util.Scanner;

public class SehirSýralama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir þehir giriniz: ");
		String sehir1 = input.next();
		
		System.out.println("Bir þehir daha giriniz giriniz: ");
		String sehir2 = input.next();
		
		if(sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("Sehirleri sirali sekilde sýralýyoruz: " + sehir1 + " " + sehir2);
		}else {
			System.out.println("Sehirleri sirali sekilde sýralýyoruz: " + sehir2 + " " + sehir1);
		}
		

	}

}
