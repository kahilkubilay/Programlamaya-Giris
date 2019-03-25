public class Dongu13Katlari {

    public static void main(String[] args) {


        for (int i = 100; i > 0; i--) {
            if (i % 13 == 0) {
                System.out.printf(" %d ", i);

            }
        }
        //Sayılabilirlik Teorisi ile::
        /*
            for(int i=0 ; i<100 ; i++) {

                if( (100-i)%13 == 0 ) {
                    System.out.println(100-i);
                }
            }
        
        */

    } 
    
}
