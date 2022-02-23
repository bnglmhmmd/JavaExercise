package Alýstýrmalar04;

import java.util.Iterator;

public class KarakterSinifi {

	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;
		ch++;

		System.out.println(i);

		System.out.println(ch++);
		char ch2 = '4';

		System.out.println(ch2);
		System.out.println((int)ch2);
		
		char ch3 = 0x0041;
		System.out.println(ch3);
		
		System.out.println("Merhaba\"java\"sinifi");
		
		char ch4 = '\u0041';
		System.out.println(ch4);
		
		for (int j = 0; j < 500; j++) {
			System.out.printf("%2c" , j);
			if((j + 1 ) % 30 == 0) {
				System.out.println();
			}
			
			
		}
		
	
		
		
		

	}

}
