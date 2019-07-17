import java.util.*;
import java.util.Arrays.*;
class digitpairs
{
    
    public static int largest(int n)
    {
        int r,ld=0;
        while(n>0)
        {
            r=n%10;
            if(ld<r) 
            {
                ld=r;
            }
            n=n/10;
        }
        return ld;
    }
    public static int smallest(int n)
    {
        int d,sm=9;
        while(n>0) 
        {
            d = n % 10;
            if(sm > d) {
                sm = d;
            }
            n = n / 10;
        }
        return sm;
    }
        
  public static void main(String args[])
  {
        int[] q=new int[500];
        int[] bs=new int[500];
        int ctr=0;
        int ctr1=0;
        int z=0;
        Scanner sc=new Scanner(System.in);
        //System.out.print("Enter the array size:");
        int sz=sc.nextInt();
        //System.out.print("Enter "+sz+" 3-Digit Numbers:");
        for(int i=0;i<sz;i++)
        {    
            q[i]=sc.nextInt();
            int l=largest(q[i]);
            int s=smallest(q[i]);
            //System.out.println(l);
            //System.out.println(s);
    	   int lar=l*11;
    	   int sma=s*7;
    	   bs[i]=lar+sma;
           if(bs[i]>99)
           {
                bs[i]=bs[i]%100;
           }
    	   System.out.println("Bit Score:"+bs[i]);
        }
        for(int j=0;j<sz;j++)
        {
            if((bs[j]/10)%10==(bs[j+2]/10)%10)
            {
                ctr++;
            }
            else if((bs[j]/10)%10==(bs[j+1]/10)%10)
            {
                ctr1++;
            }
            z=ctr+ctr1;
        }
        System.out.print(z);
  }
}