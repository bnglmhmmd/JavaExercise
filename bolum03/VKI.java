package bolum3Alýstýrmalar;

import java.util.Scanner;

public class VKI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Agýrlýgýnýzý kg cinsinden  giriniz:");
		double agýrlýk = input.nextDouble();
		System.out.println("Boyunuzu m cinsinden giriniz:");
		double boy = input.nextDouble();
		
		double vki = agýrlýk / (boy * boy );
		System.out.println("vki: " + vki);
		
		if(vki < 18.5) {
			System.out.println("Çok zayýf");
		}else if(vki < 25){
			System.out.println("Normal düzeyde");
		}else if(vki < 30) {
			System.out.println("Kilolu durumdasýn");
		}else {
			System.out.println("Obez durumdasýn");
		}
		

	}

}
