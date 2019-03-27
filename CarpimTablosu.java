
package carpimtablosu;

import java.util.Scanner;

public class carpimTablosu {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
		int loopVal;
		
		System.out.print("Çarpım tablosunun boyutunu giriniz: ");
		loopVal = input.nextInt();
		
		for(int i=0 ; i<loopVal ; i++) {
			
			if( (i+1) == 1) {
				for(int l=0; l<loopVal ; l++) {
					System.out.print((l+1) + " ");
				}
				System.out.println();
			}
			
			for(int j=0 ; j<loopVal ; j++) {
				
				System.out.print(((i+1)*(j+1)) + " ");
				
			}
			System.out.println();
        
        //farklı format
        /*
        for(int i=1;i<=10;i++)
        {
            for(int b=1;b<=10;b++)
            {
                System.out.println(i + " X " + b +" = " + (i*b));
            }
            System.out.println("*******");
        }
       
    }
    */
        }
    }
}
