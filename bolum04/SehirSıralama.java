package Al�st�rmalar04;

import java.util.Scanner;

public class SehirS�ralama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir �ehir giriniz: ");
		String sehir1 = input.next();
		
		System.out.println("Bir �ehir daha giriniz giriniz: ");
		String sehir2 = input.next();
		
		if(sehir1.compareToIgnoreCase(sehir2) < 0) {
			System.out.println("Sehirleri sirali sekilde s�ral�yoruz: " + sehir1 + " " + sehir2);
		}else {
			System.out.println("Sehirleri sirali sekilde s�ral�yoruz: " + sehir2 + " " + sehir1);
		}
		

	}

}
