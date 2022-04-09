package bolum08;

public class ikiBoyutluDiziÝslemleri {

	public static void main(String[] args) {
		int[][] ikiBoyutluDizi = new int[10][10];

		rassalDegerleDoldur(ikiBoyutluDizi);

		diziyiYazdir(ikiBoyutluDizi);

		int toplam = tümElemanlarinToplami(ikiBoyutluDizi);
		System.out.println("-------------------------------------");
		System.out.println("Matristeki elemanlarin toplami = " + toplam);

	}

	public static void rassalDegerleDoldur(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				ikiBoyutluDizi[satir][sutun] = (int) (Math.random() * 100);

			}
		}
	}

	private static void diziyiYazdir(int[][] ikiBoyutluDizi) {
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				System.out.printf("%3d", ikiBoyutluDizi[satir][sutun]);

			}
			System.out.println();
		}
	}

	private static int tümElemanlarinToplami(int[][] ikiBoyutluDizi) {
		int toplam = 0;
		
		for (int satir = 0; satir < ikiBoyutluDizi.length; satir++) {
			for (int sutun = 0; sutun < ikiBoyutluDizi[satir].length; sutun++) {
				toplam += ikiBoyutluDizi[satir][sutun];
			}

		
		}
		return toplam;

	}
}
