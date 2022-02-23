package bolum01;

import java.util.Scanner;

public class FahrenaytıDereceyeCevirme {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Dereceye donusturlmesi için bir fahrenayt giriniz:");
		
		int fahrenayt = klavye.nextInt();
		
		double derece = (5.0 / 9) * (fahrenayt - 32);
		
		System.out.println(fahrenayt + " fahrenayt = "  +  derece  +  " derecedir.");
		
		
	}

}
