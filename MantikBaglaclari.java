package mantikbaglaclari;

import java.util.Scanner;

public class MantikBaglaclari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        sayi2 = input.nextInt();
        System.out.print("Son Sayıyı Giriniz: ");
        sayi3 = input.nextInt();

        //İlk Girilen Sayı 2. Sayı ve 3. Sayı değerinin arasında mı?
        if (sayi1 > sayi2 && sayi1 < sayi3) {
            System.out.println(sayi1 + " sayısı 2. sayı ve 3. sayının arasındadır.");
        } else {
            System.out.println(sayi1 + " sayısı 2. sayı ve 3. sayının arasında değildir.");
        }
        //İlk Girilen Sayı 2. Sayı ile eşit ve 3. Sayıdan Küçük mü?
        if (sayi1 == sayi2 && sayi1 < sayi3) {
            System.out.println(sayi1 + " sayısı 2. sayı ile eşit ve 3. sayıdan küçüktür.");
        } else {
            System.out.println(sayi1 + " sayısı 2. sayı ile eşit ve 3. sayıdan küçük değildir.");
        }
        //İlk Girilen Sayı 2. Sayı veya 3. Sayıdan Büyük mü?
        if (sayi1 > sayi1 || sayi1 > sayi3) {
            System.out.println(sayi1 + " sayısı 2. sayı veya 3. sayıdan büyüktür.");
        } else {
            System.out.println(sayi1 + " sayısı 2. sayı veya 3. sayıdan büyük değildir.");
        }
        //Girilen Sayılar Birbirlerine Eşit mi?
        if (sayi1 == sayi2 && sayi2 == sayi3) {
            System.out.println("Girilen sayılar birbirlerine eşit.");
        } else {
            System.out.println("Girilen sayılar birbirlerine eşit değildir.");
        }
        
        input.close();
        
        //diğer bir yöntem
        /*
        //son durum mümkünse, diğerlerini kontrol etmek gerekmiyor.
		if( a == b && b == c) {
			System.out.print("a, b ile c arasında bir sayı değildir\n"
					+ "a, b veya c'den daha büyük değildir.\n"
					+ "Üç sayı birbirine eşittir.");
		}else {
			//birinci durum
			if(a > b && a < c || a > c && a<b ) System.out.println("a, b ile c arasında bir sayıdır");
			else System.out.println("a, b ile c arasında bir sayı değildir.");
			
			//ikinci durum
			if(a == b && a < c) System.out.println("a, b'ye eşit ve c'de küçüktür.");
			else System.out.println("a hem b'ye eşit hem de c'den küçük değildir.");
			
			//üçüncü durum
			if(a > b) System.out.println("a b'den büyüktür.");
			
			if(a > c) System.out.println("a c'den büyüktür.");
			
		}
        */
    }
}
