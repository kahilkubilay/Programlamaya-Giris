package githubBilgisayarKavramlari;

import java.util.Scanner;

public class P12_github {

	public static void main(String[] args) {
		/* TODO Q12::Fibonacci serisinin ilk iki elemanı 1'dir.
		*  Diğer elemanları, kendisinden önce gelen son iki elemanın
		*  toplamıdır. Klavyeden bir sayı okuyarak, girilen sayı kadar
		*  fibonacci serisinin elemanını ekrana bastıran kodu yazınız.
		*/
		
		Scanner input = new Scanner(System.in);
		int loopVal;
		
		System.out.print("Üretmek istediğiniz sayı miktarını giriniz: ");
		loopVal = input.nextInt();
		int fib=1, val = 0;
		
		for(int i=0 ; i<loopVal ; i++) {
			
			System.out.println(fib);
			
			fib += val;
			val = fib-val;
			
		}
		
		input.close();
		System.exit(0);
	}
}
