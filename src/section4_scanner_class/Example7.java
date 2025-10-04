package section4_scanner_class;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b1;

        System.out.println("Enter a boolean value");
        b1=sc.nextBoolean();

        System.out.println("Boolean value b1 is="+b1);

    }
}
