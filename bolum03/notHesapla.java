package bolum3Alýstýrmalar;

import java.util.Scanner;

public class notHesapla {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir not giriniz:");
		
		int dersNotu = input.nextInt();
		
		if(dersNotu >= 90) {
			System.out.println("Ders Notunuz A");
		}else if(dersNotu >= 80) {
			System.out.println("Ders Notunuz B");
		}else if(dersNotu >= 70 ) {
			System.out.println("Ders Notunuz C");
		}else if(dersNotu >= 60) {
			System.out.println("Ders Notunuz D");
		}else {
			System.out.println("Dersten kaldýnýz !!");
		}
		
		
	}
	
	

}
