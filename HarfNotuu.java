package bilgisayarkavramlari;
import java.util.Scanner;
public class BilgisayarKavramlari {
    public static void main(String[] args) {
        System.out.println("Notunuzu giriniz: ");
        Scanner notGir = new Scanner(System.in);
        int not = notGir.nextInt();
        notGir.close();
        if(not > 100 || not < 0){
            System.ot.println("0-100 arasında bir not giriniz.");
        }
        else if(not>=90){
            System.out.println("Harf Notunuz: A");
        }
        else if(not>=80){
            System.out.println("Harf Notunuz: B");
        }
        else if(not>=70){
            System.out.println("Harf Notunuz: C");
        }
        else{
            System.out.println("Harf Notunuz: F");
        }
        
    }
    
}
