package section5_conditional_statement;

public class Example2
{
    public static void main(String[] args)
    {
        //Logical Operators
        int a=10;
        int b=12;
        int c=7;

        boolean res= (a>b && a>c);
        System.out.println(res);             //false

        res=(b>a && c<a);
        System.out.println(res);               //true

        res= (a>b || a>c);
        System.out.println(res);               //true

        res=!(a>b || a>c);
        System.out.println(res);               //false
    }
}
