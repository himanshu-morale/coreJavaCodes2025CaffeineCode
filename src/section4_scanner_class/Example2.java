package section4_scanner_class;

import java.lang.*;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        byte b1;

        System.out.println("Enter byte value:");
        b1=sc.nextByte();

        System.out.println("The value of byte b1 is="+b1);
    }

}
