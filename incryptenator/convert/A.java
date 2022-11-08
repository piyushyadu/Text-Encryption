package convert;

import Prime.Pri;
public abstract class A implements pading, incrypt {
    
    @Override
    public int[] numToPrime(int[] a)
    {
        Pri obj=new Pri();
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            a[i]=obj.getPrime(a[i]);
        }
        return a;
    }

    @Override
    public int[] primeToProd(int[] a, int p)
    {
        int n=a.length;
        for(int i=0; i<n; i++)
        {
            a[i]=a[i]*p;
        }
        return a;
    }

}
