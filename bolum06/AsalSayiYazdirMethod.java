package Alýstýrmalar06;

import java.util.Iterator;

public class AsalSayiYazdirMethod {

	public static void main(String[] args) {
		
		int asalsayiSayacai = 0;
		int sayi = 2;
		
		while(asalsayiSayacai < 1000) {
			if(asalMi(sayi)) {
				System.out.printf("%8d" ,sayi);
				asalsayiSayacai++;
				if(asalsayiSayacai % 20 == 0) {
					System.out.println();
				}
			}
			
			sayi++;
			
		
		}
	}
	
	
	
	
	public static boolean asalMi(int s) {
		
		for(int i = 2; i < s; i++) {
			if(s % i == 0) {
				return false;
				
			}
			
		} 	
		return true;
		
	}

}
