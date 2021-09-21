package Algorithm;

public class binarySearch {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid ;
        while (start<=end) {
            mid =(end+start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,5};
        int target = 2;
        binarySearch bs  = new binarySearch();
        System.out.println(bs.search(arr, target));
    }
}
