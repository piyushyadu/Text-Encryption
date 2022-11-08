package Prime;

public class Pri { 

    static boolean[] priSiv=new boolean[105000];
    static int[] priNo=new int[10000];
    static int[] revPriNo=new int[105000];

    public Pri(){ }
    public Pri(int a) {
        for(int i=2; i<105000; i++) priSiv[i]=true;

        for(int i=2; i*i<=105000; i++)
        {
            for(int j=i*i; j<10500; j+=i)
            {
                priSiv[j]=false;
            }
        }

        for(int i=1, j=2; i<10000; j++)
        {
            if(priSiv[j])
            {
                priNo[i]=j;
                i++;
            }
        }

        for(int i=1; i<10000; i++)
        {
            revPriNo[priNo[i]]=i;
        }
    }

    public int getPrime(int a) {
        return priNo[a];
    }

    public int getRevPrime(int a) {
        return revPriNo[a];
    }
    
}
