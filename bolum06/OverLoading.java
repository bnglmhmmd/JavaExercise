package Alıstırmalar06;

public class OverLoading {
	public static void main(String[] args) {
		
		double d1 = 5.86;
		double d2 = 18.6;
		
		double max = max(d1,d2);
		
		System.out.println(max);
				
		
	}

	
	public static double max(double sayi1, double sayi2) {
		double max;
		
		if(sayi1 > sayi2) {
			max = sayi1;
		}else {
			max = sayi2;
		}
		
		// max alternatif yazımı
		max = (sayi1 > sayi2 ) ? sayi1 : sayi2;
		
		
		return max;
	}
	
}
