package bolum3Alýstýrmalar;

import java.util.Scanner;

public class HaftasonuMuHaftaiçiMi {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir gün giriniz: Ör(Pazartesi için 1 pazar için 7)");
		
		int gun = klavye.nextInt();
		
		switch (gun) {
		case 1 : 
		case 2:	
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("hafta sonu");
		break;
		default:
			System.out.println("Yanlýs girdi.");
			
		}
		
		System.out.println("Devam etmek istiyor musunuz ? ");
		String cevap = klavye.next();
		
		switch (cevap.charAt(0)) {
		case 'e': 
		case 'E':
			System.out.println("Ýþleme devam ediliyor.");
			break;
		case 'H':
		case 'h':
			System.out.println("Ýþlem sonlandýrýlýyor.");
			break;
		default:
			System.out.println("Lütfen geçerli bir yanýt girin.");
			
		}
		
		
		}
		
		
	}


