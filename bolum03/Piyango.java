package bolum3Al�st�rmalar;

import java.util.Scanner;

public class Piyango {

	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90 + 10);
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("�ki basamakl� bir sayi tahmin ediniz:");
		int tahmin = klavye.nextInt();
		
		int piyangonunBirlerBasamag� = piyango % 10;
		int piyangonunOnlarBasamag� = piyango / 10;
		int tahmininBirlerBasamag� = tahmin % 10;
		int tahmininOnlarBasamag� = tahmin / 10;
		
		System.out.println("Piyangonun numaras�:" + piyango);
		
		if(piyango == tahmin) {
			System.out.println("Tebrikler 10000TL kazand�n�z :)");
		}else if(tahmininOnlarBasamag� == piyangonunBirlerBasamag� && 
				tahmininBirlerBasamag� == piyangonunOnlarBasamag�) {
			System.out.println("�ki rakam bildiniz. 3000TL Kazand�n�z.");
			
		}else if(piyangonunBirlerBasamag� == tahmininBirlerBasamag�
				|| piyangonunBirlerBasamag� == tahmininOnlarBasamag�
				|| piyangonunOnlarBasamag� == tahmininBirlerBasamag�
				|| piyangonunOnlarBasamag� == tahmininOnlarBasamag�) {
			
			System.out.println("Bir rakam� bildiniz. 1000TL kazand�n�z.");
			
		}else {
			System.out.println("Bilemediniz :(");
		}
		
		
	}

}
