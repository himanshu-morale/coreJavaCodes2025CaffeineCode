package section6_loops;

public class Example9
{
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i=0;i<3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(i+"..."+j);
            }
        }
        System.out.println("End");
    }
}
