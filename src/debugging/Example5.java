package debugging;

public class Example5 {
    public static int headLinearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                int temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
                return 0;
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
        int key=72;
        System.out.println("Array before move to head linear search");
        display(nums);
        int foundindex=headLinearSearch(nums,key);
        System.out.println("\nArray after move to head linear search");
        display(nums);
        System.out.printf("\n%d found at index %d",key,foundindex);

    }
}
