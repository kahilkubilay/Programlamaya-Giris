package githubBilgisayarKavramlari;

public class P11_github {

	public static void main(String[] args) {
		/* TODO Q10::4 kolon şeklinde aşağıdaki sayiları yazdırınız: 
		   1.Kolonda: 1'den 100'e kadar olan 15'in katları
		   2.Kolonda: 1'den 30'a kadar olan 5'in katları
		   3.Kolonda: 100'den 50'ye kadar olan 10'un katları
		   4.Kolonda: 2'den 64'e kadar olan 2'nin üstleri
		*/

		int up = 1;
		
		for(int i=0 ; i<6 ; i++) {
			
			for(int l=0 ; l<(i+1) ; l++) {
				up *= 2;
			}
			
			System.out.println( ((i+1)*15) + "  " + ((i+1)*5) + "  "
							  + (110-(i+1)*10) + "  " + (up));
			
			up = 1;
			
		}
	}
}
