package ucsayidanenbuyugu;

import java.util.Scanner;

public class UcSayidanEnBuyugu {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("1. Sayıyı Giriniz: ");
        sayi1 = oku.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = oku.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        sayi3 = oku.nextInt();
        oku.close();
        int buyuksayi = sayi1, kucuksayi = sayi1;

        if (sayi3 > sayi2 && sayi3 > sayi1) {
            buyuksayi = sayi3;
        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
            buyuksayi = sayi2;
        }

        if (sayi2 < sayi1 && sayi2 < sayi3) {
            kucuksayi = sayi2;
        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            kucuksayi = sayi3;

        }

        System.out.println("En Büyük Sayı: " + buyuksayi);
        System.out.print("En Küçük Sayı: " + kucuksayi);
        
      /*
        Scanner input = new Scanner(System.in);
		int numb1, numb2, numb3, bigNumb = 0, smallNumb = 0;
		
		System.out.print("1. sayiyi giriniz: ");
		numb1 = input.nextInt();
		System.out.print("2. sayiyi giriniz: ");
		numb2 = input.nextInt();
		System.out.print("3. sayiyi giriniz: ");
		numb3 = input.nextInt();
		input.close();
		
		if( numb1 >= numb2 && numb1 >= numb3) {
			
			bigNumb = numb1;
			
			if(numb2 >= numb3) smallNumb = numb3;
			else smallNumb = numb2;
			
		}else if(numb2 >= numb1 && numb2 >= numb3) {
			
			bigNumb = numb2;
			
			if(numb1 >= numb3) smallNumb = numb3;
			else smallNumb = numb1;
			
		}else if(numb3 >= numb1 && numb3 >= numb2) {
			
			bigNumb = numb3;
			
			if(numb1 >= numb2) smallNumb = numb2;
			else smallNumb = numb1;
		}
		
		System.out.println("En büyük sayi: " + bigNumb + ", en küçük sayi: " + smallNumb);
      */
    }

}
