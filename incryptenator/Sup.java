import java.util.Scanner;
import Prime.Pri;
import convert.C;

public class Sup {
    
    public static int menu()
    {
        System.out.println("1. for incryption");
        System.out.println("2. for decryption");
        System.out.println("3. for exit");
        System.out.print("Enter choice= ");

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        return a;
    }

    public static void show(int[] a)
    {
        System.out.print(a.length+" ");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void incryption() {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter text= ");
        String s=sc.nextLine();

        System.out.print("enter pin= ");
        int p=sc.nextInt();

        C ii=new C();
        Pri jj=new Pri();
        int[] a=ii.txtToNum(s);
        a=ii.numToPrime(a);
        p=jj.getPrime(p);
        a=ii.primeToProd(a, p);
        
        System.out.print("encrypted data= ");
        System.out.println();
        show(a);

        sc.close();
    }

    public static void decryption() {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter encrypted data= ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("enter pin= ");
        int p=sc.nextInt();
        
        C ii=new C();
        Pri jj=new Pri();
        p=jj.getPrime(p);
        a=ii.prodToPrime(a, p);
        a=ii.primeToNum(a);
        String s=ii.numToTxt(a);
        System.out.print("decrypted text= "+s);
        System.out.println();

        sc.close();

    }


}
