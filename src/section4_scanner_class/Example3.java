package section4_scanner_class;

import java.lang.*;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        short s1;

        System.out.println("Enter the short number:");
        s1=sc.nextShort();

        System.out.println("The short number s1 is="+s1);
    }
}
