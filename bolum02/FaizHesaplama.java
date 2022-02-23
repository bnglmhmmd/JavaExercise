package JavaAlýstýrmalar;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yýllýk Faiz Oranýný Giriniz:");
		double yillikFaizOrani = input.nextDouble();
		
		System.out.println("Kaç yýlda ödemek istiyorsunuz:");
		int yil = input.nextInt();
		
		System.out.println("Borç alacaðýnýz miktarý giriniz:");
		double borcMiktari = input.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		double aylikOdemeMiktari = (borcMiktari * aylikFaizOrani) / (1 - (1 / Math.pow(1 + aylikFaizOrani, yil * 12)));
		
		double toplamBorc = aylikOdemeMiktari * 12 * yil;
		
		System.out.println("Aylýk ödeme miktarý: " + (int)(aylikOdemeMiktari * 100) / 100.0);
		System.out.println("Toplam ödenecek miktar: " + (int)(toplamBorc * 100 ) / 100.0);
		 
		
		
	}

}
