package Alýstýrmalar04;

import java.util.Scanner;

public class StringNextMethodu {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Lutfen 3 adet string giriniz:");
		
		String s1 = giris.next();
		String s2 = giris.next();
		String s3 = giris.next();
	
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
		System.out.println("Cumleniz: " + (s1 + " " + s2 + " " + s3));
	}
	
	

}
