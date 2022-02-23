package bolum3Alýstýrmalar;

import java.util.Scanner;

public class Piyango {

	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90 + 10);
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Ýki basamaklý bir sayi tahmin ediniz:");
		int tahmin = klavye.nextInt();
		
		int piyangonunBirlerBasamagý = piyango % 10;
		int piyangonunOnlarBasamagý = piyango / 10;
		int tahmininBirlerBasamagý = tahmin % 10;
		int tahmininOnlarBasamagý = tahmin / 10;
		
		System.out.println("Piyangonun numarasý:" + piyango);
		
		if(piyango == tahmin) {
			System.out.println("Tebrikler 10000TL kazandýnýz :)");
		}else if(tahmininOnlarBasamagý == piyangonunBirlerBasamagý && 
				tahmininBirlerBasamagý == piyangonunOnlarBasamagý) {
			System.out.println("Ýki rakam bildiniz. 3000TL Kazandýnýz.");
			
		}else if(piyangonunBirlerBasamagý == tahmininBirlerBasamagý
				|| piyangonunBirlerBasamagý == tahmininOnlarBasamagý
				|| piyangonunOnlarBasamagý == tahmininBirlerBasamagý
				|| piyangonunOnlarBasamagý == tahmininOnlarBasamagý) {
			
			System.out.println("Bir rakamý bildiniz. 1000TL kazandýnýz.");
			
		}else {
			System.out.println("Bilemediniz :(");
		}
		
		
	}

}
