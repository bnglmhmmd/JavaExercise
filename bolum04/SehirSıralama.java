package Alıstırmalar04;

import java.util.Scanner;

public class SehirSıralama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir şehir giriniz: ");
		String sehir1 = input.next();
		
		System.out.println("Bir şehir daha giriniz giriniz: ");
		String sehir2 = input.next();
		
		if(sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("Sehirleri sirali sekilde sıralıyoruz: " + sehir1 + " " + sehir2);
		}else {
			System.out.println("Sehirleri sirali sekilde sıralıyoruz: " + sehir2 + " " + sehir1);
		}
		

	}

}
