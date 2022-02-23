package Alýstýrmalar04;

import java.util.Scanner;

public class UcegeninIçacýlarýnýHesapla {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Uc nokta giriniz:");
		
		double x1 = giris.nextDouble();
		double y1 = giris.nextDouble();
		double x2 = giris.nextDouble();
		double y2 = giris.nextDouble();
		double x3 = giris.nextDouble();
		double y3 = giris.nextDouble();
		
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		
		System.out.println("1.aci " + Math.round(A * 100) / 100.0);
		System.out.println("2.aci " + Math.round(B * 100) / 100.0);
		System.out.println("3.aci " + Math.round(C * 100) / 100.0);
	}

}
