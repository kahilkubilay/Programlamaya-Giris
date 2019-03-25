package githubBilgisayarKavramlari;

import java.util.Scanner;

public class P5_github {

	public static void main(String[] args) {
		/* TODO P5::Klavyeden iki sayı alarak bu sayıları 
		   mantıksal olarak karşılaştıran kod örneğini
		   yazınız. Kullanılacak olan operatörler
		   şunlardır: ==, !=, <, >, <=, >=
		*/
    
		Scanner input = new Scanner(System.in);
		int numb1, numb2;
		
		System.out.print("Sayi gir: ");
		numb1 = input.nextInt();
		System.out.print("Sayi gir: ");
		numb2 = input.nextInt();
		
		/* Bütün operatörleri kullanmak yerine, mantıksal
       olarak düzenlendi. */
    
    if(numb1 != numb2) {
		
			System.out.println("Sayilar eşit değildir.");
			System.out.println("Sayilar farklıdır.");
			
			if(numb1 < numb2) {
				System.out.println("İlk sayı küçüktür.");
				System.out.println("İkinci sayı küçük değildir.");
			}else {
				System.out.println("İkinci sayı küçüktür.");
				System.out.println("İlk sayı küçük değildir.");
			}
			
			System.out.println("İkinci sayı küçük eşit değildir.\nİlk sayı küçük eşit değildir.");
			
		}else{
			
			System.out.println("Sayilar eşittir.\nSayilar farklı değildir.\n"
					+ "İlk sayı küçük değildir.\nİkinci sayı küçük değildir.\n"
					+ "İlk sayı küçük eşittir.\nİkinci sayı küçük eşittir.");
		}
	}
}
