package debugging;

public class Example6
{
    public static void main(String[] args) {

        int year = 100;

        boolean[] years = new boolean[3000];

        for(int i=1; i < years.length; i++)
        {
            if(i % 4 == 0)
            {
                if(i % 100 !=0)
                {
                    years[i] = true;
                }
                if(i%400==0){
                    years[i] = true;
                }
            }

            if(i == year)
            {
                System.out.println(years[i]);
            }
        }

    }
}
