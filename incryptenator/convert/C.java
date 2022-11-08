package convert;

public class C extends B {

    @Override
    public String numToTxt(int[] a)
    {
        String s="";
        int n=a.length;
        for(int i=0; i<n; i++) s+=(char)((a[i]-19)/21+2);
        return s;
    }

    @Override
    public int[] txtToNum(String s)
    {
        int n=s.length();
        int[] a=new int[n];
        for(int i=0; i<n; i++)
        {
            int u=(int)(s.charAt(i));
            u=21*u-19;
            a[i]=u;
        }
        return a;
    }
    
}
