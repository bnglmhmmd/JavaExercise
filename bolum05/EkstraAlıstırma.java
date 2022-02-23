package Alýstýrmalar05;

import java.util.Scanner;
import java.util.*;

public class EkstraAlýstýrma {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz:");
		System.out.println("Bir kelime daha  giriniz:");
		String A = sc.next();
		String B = sc.next();

		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B)>0?"Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));		
	}

}
