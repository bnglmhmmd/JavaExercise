package Alýstýrmalar06;

import java.util.Scanner;

public class ObebMethod {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("1.sayýyý giriniz:");
		int sayi1 = giris.nextInt();
		
		System.out.println("2.sayýyý giriniz:");
		int sayi2 = giris.nextInt();
		
		int obeb = obeb(sayi1, sayi2);
		System.out.println(sayi1 + " ve " + sayi2 + " nin obebi: " + obeb + " dir");

	}

	public static int obeb(int sayi1, int sayi2) {
		int obeb = 1;
		int bolen  = 2;
		
		while(bolen <= sayi1 && bolen <= sayi2  ) {
			if(sayi1 % bolen == 0 && sayi2 % bolen == 0) {
				obeb = bolen;
				
				
			}
			bolen++;
		}
		return obeb;
	}
}
