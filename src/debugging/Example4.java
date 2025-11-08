package debugging;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Example4
{
    public static int transposedLinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                if (i!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    return i-1;
                }
                return i;
            }
        }
        return -1;
    }
    public static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int[] nums={12,34,23,45,38,72,56,91,67};
        int key=34;
        System.out.println("Array before transposed linear search");
        display(nums);
        int foundindex=transposedLinearSearch(nums,key);
        System.out.println("\nArray after transposed linear search");
        display(nums);
        System.out.printf("\n%d found at index %d",key,foundindex);

    }

}
