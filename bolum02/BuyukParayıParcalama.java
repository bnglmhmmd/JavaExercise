package JavaAl�st�rmalar;

import java.util.Scanner;

public class BuyukParay�Parcalama {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir miktar para giriniz: �r(11.56)");
		double para = input.nextDouble();
		
		 int toplamKurus = (int) (para * 100);
		 System.out.println("Paran�z toplam " + toplamKurus + "kurusdur");
		 
		 int toplamTl = toplamKurus / 100;
		 System.out.println("Tl miktar�:" + toplamTl);
		 
		 int kalanKurus = toplamKurus % 100; 
		 
		 int elliKurusMiktari = kalanKurus / 50;
		 System.out.println("Elli kurus miktar�:" + elliKurusMiktari);
		 kalanKurus %= 50;
		 
		 int yirmiBesKurusMiktari = kalanKurus / 25;
		 System.out.println("25 kurus miktar�: " + yirmiBesKurusMiktari);
		 kalanKurus %= 25;
		 
		 int onKurusMiktari = kalanKurus / 10;
		 System.out.println("10 kurus miktari " + onKurusMiktari);
		 kalanKurus %= 10;
		 
		 int besKurusMiktari = kalanKurus / 5;
		 System.out.println("5 kurus miktari " + besKurusMiktari);
		 kalanKurus %= 5;
		 
		 int birKurusMiktari = kalanKurus / 1;
		 System.out.println("1 kurus miktari: " + birKurusMiktari);
	
	}

}
