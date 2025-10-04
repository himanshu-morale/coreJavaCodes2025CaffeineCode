package section4_scanner_class;

import java.lang.*;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long l1;

        System.out.println("Enter the long number:");
        l1=sc.nextLong();

        System.out.println("The long number l1 is="+l1);
    }
}
