package debugging;

public class Example2
{
    public static int binarySearch(int[] nums, int key)
    {
        int low = 0;
        int high = nums.length;
        int mid;

        while (low <= high)
        {
            mid = (low + high)/2;

            if(nums[mid] == key)
            {
                return mid;
            }
            else if(nums[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args)
    {
            int[] nums = {11,22,33,56,78,90};
            int foundIndex = binarySearch(nums,78);
        System.out.println(foundIndex);
    }
}
