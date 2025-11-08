package section5_conditional_statement;

public class Example6
{
    public static void main(String[] args) {
        //else if ladder
        int marks=38;
        if(marks>=90 && marks<100)
        {
            System.out.println("Grade A");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("Grade B");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("Grade C");
        }else if(marks>=60 && marks<70)
        {
            System.out.println("Grade D");
        }
        else if(marks<60 &&marks>=40)
        {
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F(Fail)");
        }
    }
}
