package bolum3Al�st�rmalar;

import java.util.Scanner;

public class VKI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ag�rl�g�n�z� kg cinsinden  giriniz:");
		double ag�rl�k = input.nextDouble();
		System.out.println("Boyunuzu m cinsinden giriniz:");
		double boy = input.nextDouble();
		
		double vki = ag�rl�k / (boy * boy );
		System.out.println("vki: " + vki);
		
		if(vki < 18.5) {
			System.out.println("�ok zay�f");
		}else if(vki < 25){
			System.out.println("Normal d�zeyde");
		}else if(vki < 30) {
			System.out.println("Kilolu durumdas�n");
		}else {
			System.out.println("Obez durumdas�n");
		}
		

	}

}
