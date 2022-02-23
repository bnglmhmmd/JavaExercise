package bolum01;

public class SuankiSaatiGoster {
	public static void main(String[] args) {
		
		long toplamMiliSaniye = System.currentTimeMillis();
		// currentTimeMillis 1 ocak 1970 tarihinden bu yana kaç milisaniye geçtiðini veren java kütüphanesidir.
		
		System.out.println("toplam milisaniye: " + toplamMiliSaniye);
		
		long ToplamSaniye = toplamMiliSaniye / 1000;
		
		System.out.println("toplam saniye : " + ToplamSaniye);
		
		long suankiSaniye = ToplamSaniye % 60;
		
		System.out.println("Þuanki saniye  : " + suankiSaniye);
		
		long toplamDakika = ToplamSaniye / 60;
		
		System.out.println("toplam dakika  : " + toplamDakika);
		
		long suankiDakika = toplamDakika % 60;
		
		System.out.println("suanki dakika  : " + suankiDakika);
		
		long toplamSaat = toplamDakika / 60;
		
		System.out.println("toplam saat  : " + toplamSaat);
		
		long suankiSaat = toplamSaat % 24;
		
		System.out.println("suanki saat  : " + suankiSaat);
		
		System.out.println(suankiSaat + "." + suankiDakika + "." + suankiSaniye + " GMT");
		
		
		
		
		
		
		
	
	
	
	
	}
	

}
