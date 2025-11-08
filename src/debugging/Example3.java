package debugging;

public class Example3
{
    public static int linearSearch(int[] nums,int key)
    {
        for(int i=0;i<= nums.length;i++)
        {
            if(nums[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={12,34,23,45,38,72,56,91,67};
        int key=72;
        int foundindex=linearSearch(arr,key);
        System.out.println(foundindex);

    }
}
