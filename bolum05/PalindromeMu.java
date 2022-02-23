package Alýstýrmalar05;

import java.util.Scanner;

public class PalindromeMu {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir cumle giriniz:");
		String cumle = klavye.nextLine();
		
		boolean palinronMu = true;
		for(int i = 0, j = cumle.length()-1; i < j; i++, j--) {
			char ch1 = cumle.charAt(i);
			char ch2 = cumle.charAt(j);
			
			if(ch1 != ch2 ) {
				palinronMu = false;
				break;
			}
		}
		if(palinronMu) {
			System.out.println(cumle + " bir palindrondur.");
		}else {
			System.out.println(cumle + " bir palindron degildir.");
		}
		
	}
		
		
		
	
		
}
