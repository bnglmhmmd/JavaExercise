package bolum3Alıstırmalar;

import java.util.Scanner;

public class Piyango {

	public static void main(String[] args) {
		int piyango = (int)(Math.random() * 90 + 10);
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("İki basamaklı bir sayi tahmin ediniz:");
		int tahmin = klavye.nextInt();
		
		int piyangonunBirlerBasamagı = piyango % 10;
		int piyangonunOnlarBasamagı = piyango / 10;
		int tahmininBirlerBasamagı = tahmin % 10;
		int tahmininOnlarBasamagı = tahmin / 10;
		
		System.out.println("Piyangonun numarası:" + piyango);
		
		if(piyango == tahmin) {
			System.out.println("Tebrikler 10000TL kazandınız :)");
		}else if(tahmininOnlarBasamagı == piyangonunBirlerBasamagı && 
				tahmininBirlerBasamagı == piyangonunOnlarBasamagı) {
			System.out.println("İki rakam bildiniz. 3000TL Kazandınız.");
			
		}else if(piyangonunBirlerBasamagı == tahmininBirlerBasamagı
				|| piyangonunBirlerBasamagı == tahmininOnlarBasamagı
				|| piyangonunOnlarBasamagı == tahmininBirlerBasamagı
				|| piyangonunOnlarBasamagı == tahmininOnlarBasamagı) {
			
			System.out.println("Bir rakamı bildiniz. 1000TL kazandınız.");
			
		}else {
			System.out.println("Bilemediniz :(");
		}
		
		
	}

}
