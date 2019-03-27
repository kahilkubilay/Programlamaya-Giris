package githubBilgisayarKavramlari;

import java.util.Scanner;

public class p14_github {

	public static void main(String[] args) {
		/* TODO Q14::Matrisin boyutunu kullanıcıdan okuyup
		   sadece diyagonu (köşegeni) 1 olan ve diğer elemanları
		   0 olan bir kare matrisi ekrana bastırın.
		*/
		
		Scanner input = new Scanner(System.in);
		int val;
		
		System.out.print("Matris boyutunu giriniz: ");
		val = input.nextInt();
		
		for(int i=0; i<val; i++) {
			
			for(int l=0 ; l<val ; l++) {
				
				if((l+1) == (i+1)) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			
			System.out.println();
			
		}
		
		input.close();
		System.exit(0);

	}

}
