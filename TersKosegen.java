package githubBilgisayarKavramlari;

import java.util.Scanner;

public class P15_github {

	public static void main(String[] args) {
		/*  TODO Q15::Ters köşegeni (anti-diagon) 1 olan ve diğer
			bütün elemanları 0 olan matrisi ekrana bastırınız.
		*/
		
		Scanner input = new Scanner(System.in);
		int val;
		
		System.out.print("Matris boyutunu giriniz: ");
		val = input.nextInt();
		
		for(int i=0 ; i<val ; i++) {
			
			for(int l=0 ; l<val ; l++) {
				
				if((val+1)-(i+1) == (l+1)) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			
			System.out.println();
			
		}
		
	}

}
