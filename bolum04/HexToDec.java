package Alýstýrmalar04;

import java.util.Scanner;

public class HexToDec {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir Hex Sayi Giriniz:");
		
		String girdi = giris.next();
		
		if(girdi.length() != 1) {
			System.err.println("Tek karakter giriniz!");
			System.exit(0);
			
		}
		
		char ch = girdi.toLowerCase().charAt(0);
		int sayi = 0;
		
		if('a' <= ch && ch <= 'f') {
			sayi = ch - 'a' + 10;
			
		}else if('0' <= ch && ch <= '9') {
			sayi = ch - '0';
			
		}else {
			System.err.println("Hatalý Giriþ!");
			System.exit(0);
		}
		
		System.out.println("Hex " + ch + " nin degeri " + sayi);
		

	}

}
