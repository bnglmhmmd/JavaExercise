package bolum3Alıstırmalar;

import java.util.*;

public class çıkartmaArasinav {

	public static void main(String[] args) {
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		if(sayi1 < sayi2) {
			int temp = sayi1;
			sayi1 = sayi2;
			sayi2 = temp;
		}
		
		System.out.println(sayi1 + " - " + sayi2 + " =? ");
		
		Scanner input = new Scanner(System.in);
		int sonuc = input.nextInt();
		
		if(sayi1 - sayi2 == sonuc ) {
			System.out.println("Tebrikler bildiniz..");
		}else {
			System.out.println("Yanlıs cevap verdiniz. Dogrusu " + sayi1 + " - " + sayi2 + " = " +  (sayi1 - sayi2));
		}
		

	}

}
