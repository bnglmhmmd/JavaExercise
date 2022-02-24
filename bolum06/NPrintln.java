package Alýstýrmalar06;

public class NPrintln {

	public static void main(String[] args) {
		nPrintln("Merhaba java", 33);
		
	}

	static void nPrintln(String mesaj, int donguSayisi) {
		
		for (int i = 0; i < donguSayisi ; i++) {
			System.out.println(mesaj);
			
		}
	}

}
