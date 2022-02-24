package Alýstýrmalar06;

public class StackOverFlow {

	public static void main(String[] args) {
		
		metot(0);
		
	}

	static void metot(int sayac) {
		if(sayac == 1000) {
			return;
		}
		
		sayac++;
		System.out.println(sayac);
		metot(sayac);
		
	}

}
