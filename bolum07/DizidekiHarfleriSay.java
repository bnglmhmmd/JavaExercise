package Alistirmalar07;

public class DizidekiHarfleriSay {
	public static void main(String[] args) {
		
		char[] karakterDizisi = rassalDiziyiYarat();
		
		karakterDizisiniYazdir(karakterDizisi);
		
		int [] sayac = 	harfleriSay(karakterDizisi);
		
		sayacıYazdır(sayac);
	}

	private static void sayacıYazdır(int[] sayac) {
		System.out.println("Sayac yazdıiliyor..");
		for (int i = 0; i < sayac.length; i++) {
			System.out.print((char)('a' + i) + ":" + sayac[i] + " ");
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

	private static int[] harfleriSay(char[] karakterDizisi) {
		int[] sayac = new int[26];
		
		for (int i = 0; i < karakterDizisi.length; i++) {
			sayac[karakterDizisi[i] - 'a']++;
			
		}
		
		return sayac;
	}

	public static void karakterDizisiniYazdir(char[] karakterDizisi) {
		for (int i = 0; i < karakterDizisi.length; i++) {
			System.out.print(karakterDizisi[i] + " ");
			if((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
		
	}

	public static char[] rassalDiziyiYarat() {
		
		char[] dizi = new char[100];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = rassalKarakterBul();
			
		}
		return dizi;
	}

	private static char rassalKarakterBul() {
		return (char)((int)(Math.random() * 26) + 'a');
	}

}
