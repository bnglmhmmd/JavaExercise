package Al�st�rmalar05;

public class AsalSayiBulma {
	public static void main(String[] args) {
		
		int asalSayiSayaci = 0;
		int sayi = 2;
		
		while(asalSayiSayaci < 50) {
			boolean asalMi = true;
			
			for(int i = 2; i < sayi; i++) {
				if(sayi % i == 0) {
					asalMi = false;
				}
			}
			
			if(asalMi == true) {
				asalSayiSayaci++;
				System.out.println(asalSayiSayaci + ". asal say�:" + sayi);
			}
			sayi++;
		}
		
	}

}
