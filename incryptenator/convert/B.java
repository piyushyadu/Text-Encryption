package convert;

import Prime.Pri;
public abstract class B extends A {

    @Override
    public int[] prodToPrime(int[] a, int p)
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            a[i]=a[i]/p;
        }
        return a;
    }

    @Override
    public int[] primeToNum(int[] a)
    {
        Pri obj=new Pri();
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            a[i]=obj.getRevPrime(a[i]);
        }
        return a;
    }
    
}
