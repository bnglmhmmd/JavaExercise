package bolum3Al�st�rmalar;

import java.util.Scanner;

public class HaftasonuMuHaftai�iMi {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir g�n giriniz: �r(Pazartesi i�in 1 pazar i�in 7)");
		
		int gun = klavye.nextInt();
		
		switch (gun) {
		case 1 : 
		case 2:	
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta i�i");
			break;
		case 6:
		case 7:
			System.out.println("hafta sonu");
		break;
		default:
			System.out.println("Yanl�s girdi.");
			
		}
		
		System.out.println("Devam etmek istiyor musunuz ? ");
		String cevap = klavye.next();
		
		switch (cevap.charAt(0)) {
		case 'e': 
		case 'E':
			System.out.println("��leme devam ediliyor.");
			break;
		case 'H':
		case 'h':
			System.out.println("��lem sonland�r�l�yor.");
			break;
		default:
			System.out.println("L�tfen ge�erli bir yan�t girin.");
			
		}
		
		
		}
		
		
	}


