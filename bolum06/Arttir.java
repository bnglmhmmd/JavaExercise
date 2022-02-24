package Alýstýrmalar06;

public class Arttir {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("X in metoda gönderilmeden önceki degeri: " + x);
		
		arttir(x);
		
		System.out.println("X in metoda gönderildikten sonraki degeri: " + x);
		
	}

	static void arttir(int n) {
		
		n++;
		
		System.out.println(" Arttir metodunun içindeki n nin degeri: " + n);
		
		
	}

}
