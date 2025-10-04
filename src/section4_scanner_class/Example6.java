package section4_scanner_class;

import java.lang.*;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double d1;

        System.out.println("Enter the double number:");
        d1=sc.nextDouble();

        System.out.println("The double number d1 is="+d1);
    }
}