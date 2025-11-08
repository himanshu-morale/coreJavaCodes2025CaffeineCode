package section5_conditional_statement;

public class Example5
{
    public static void main(String[] args) {
        //Nested If else
        int x=-12;
        if (x>0)
        {
            if(x%2==0)
            {
                System.out.println("x is positive and even");
            }
            else
            {
                System.out.println("x is positive and Odd");
            }
        }
        else{
            if(x%2==0)
            {
                System.out.println("x is Negative and even");
            }
            else
            {
                System.out.println("x is Negative and Odd");
            }
        }
    }
}
