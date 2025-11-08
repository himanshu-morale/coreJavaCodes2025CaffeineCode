package section5_conditional_statement;

public class Example1
{
    public static void main(String[] args) {
        int a=10;
        int b=12;
        int c=10;

        //Relational operator
        boolean res = a>b;
        System.out.println(res);    //false

        res= c<a;
        System.out.println(res);    //false

        res= a==b;
        System.out.println(res);    //false

        res= a==c;
        System.out.println(res);     //true

        res= a!=b;
        System.out.println(res);      //true

        res= a>=b;
        System.out.println(res);       // false

        res= a<=c;
        System.out.println(res);           //true
    }

}
