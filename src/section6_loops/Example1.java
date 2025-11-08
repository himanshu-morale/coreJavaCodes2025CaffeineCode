package section6_loops;

public class Example1
{
    //GCD
    public static void main(String[] args)
    {
        int m=175;
        int n=100;
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else if(n>m)
            {
                n=n-m;
            }
        }
        System.out.println("GCD="+1);
    }
}
