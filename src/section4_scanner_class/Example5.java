package section4_scanner_class;

import java.lang.*;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float f1;

        System.out.println("Enter the floating number:");
        f1=sc.nextFloat();

        System.out.println("The float number f1 is="+f1);
    }
}
