package Alıstırmalar06;

public class TestMax {

	public static void main(String[] args) {
		
		int i = (int)(Math.random() * 10);
		int j = (int)(Math.random() * 10);
		
		int k = max(i,j);
		System.out.println(i + " ve " + j + " arasındaki buyuk sayi " + k + " dir");
		
		
		
	}
	
	static int max(int sayi1, int sayi2) {
		int result;
		
		if(sayi1 > sayi2) {
			result = sayi1;
		}else {
			result = sayi2;
			
		}
		return result;
		
	}

}
