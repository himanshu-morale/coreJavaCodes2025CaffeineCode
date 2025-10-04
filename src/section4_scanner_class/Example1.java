package section4_scanner_class;
import java.lang.*;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x;
        int y;

        System.out.println("Enter integer x:");
        x=sc.nextInt();

        System.out.println("Enter integer y:");
        y=sc.nextInt();

        System.out.println("The value of x and y is "+x+ ","+y);

    }
}
