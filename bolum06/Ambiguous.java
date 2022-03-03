package Alýstýrmalar06;

public class Ambiguous {

	public static void main(String[] args) {
		max(3,8.6);
	}
	public static double max(int sayi1, double sayi2){
		if(sayi1 > sayi2)
			return sayi1;
		else
			return sayi2;
		
	}
	
	
	public static double max(double sayi1, int sayi2){
		if(sayi1 > sayi2)
			return sayi1;
		else
			return sayi2;
		
	}
	
}
