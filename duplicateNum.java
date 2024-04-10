public class duplicateNum {
    public static int duplicate(int[] nums) {
        int temp;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            
            } else if (nums[i] != i + 1 && nums[i] == nums[nums[i] - 1]) {
                return nums[i];
            } else {
                i++;
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2 };
        System.out.println(duplicate(nums));
    }
}
