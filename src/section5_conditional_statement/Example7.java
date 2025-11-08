package section5_conditional_statement;

public class Example7
{
    public static void main(String[] args) {
        //Leap Year Problem
        int year =2023;

        //Code 1
        System.out.print("This is code 1:");
        if(year%400==0)
        {
            System.out.println("It is a leap year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }

        //Code 2
        System.out.print("This is code 2:");
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
