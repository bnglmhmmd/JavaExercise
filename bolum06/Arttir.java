package Al�st�rmalar06;

public class Arttir {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("X in metoda g�nderilmeden �nceki degeri: " + x);
		
		arttir(x);
		
		System.out.println("X in metoda g�nderildikten sonraki degeri: " + x);
		
	}

	static void arttir(int n) {
		
		n++;
		
		System.out.println(" Arttir metodunun i�indeki n nin degeri: " + n);
		
		
	}

}
