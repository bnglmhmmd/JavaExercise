package Al�st�rmalar05;

import java.util.Scanner;

public class Tekrarl�ToplamaQuiz {

	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		
		Scanner klavye = new Scanner(System.in);
		System.out.println(sayi1 + " + " + sayi2 + " =?");
		
		int cevap = klavye.nextInt();
		
		while(sayi1 + sayi2 != cevap) {
			System.out.println("Yanl�� cevap girdiniz..");
			System.out.println(sayi1 + " + " + sayi2 + " =?");
			cevap = klavye.nextInt();
			
		}
		
		System.out.println("Bildiniz..");
		
		
	}

}
