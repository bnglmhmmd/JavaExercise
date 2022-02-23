package Alýstýrmalar04;

import java.util.Scanner;

public class KarakterAnalizi {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir þey girin: ");
		String girdi = klavye.next();
		
		
		char ch = girdi.charAt(0);
		
		if('A' <= ch &&  ch <= 'Z') {
			System.out.println(ch + " buyuk harf");
		}
		if('a' <= ch && ch <= 'z') {
			System.out.println(ch + " kucuk harf");
		}
		if('0' <= ch && ch <= '9') {
			System.out.println(ch + " rakam");
		}

	}

}
