package bolum08;

public class ÝkiBoyutluDiziler {
	public static void main(String[] args) {
		
		int[][] dizi1 = null;
		
		System.out.println(dizi1);

		dizi1 = new int[5][5];
		
		dizi1[2][3] = 7;
		
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi1.length; j++) {
				System.out.print(dizi1[i][j] + " ");
				
				
			}
			System.out.println();
			
		}
	
	}

}