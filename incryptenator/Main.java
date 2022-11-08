import Prime.Pri;

public class Main {

    public static void main(String[] args) {

        Pri priObj=new Pri(1);


        int k=1;
        while(k!=3) {

            k=Sup.menu();
            
            switch(k) {
                
                case 1:
                    Sup.incryption();
                    break;
                case 2:
                    Sup.decryption();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid input");
            }
        }        

    }

}
