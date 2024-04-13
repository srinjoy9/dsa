public class firstMissingPositive {
    public static int missing(int[] nums) {
        int temp;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i+1 && nums[i]<nums.length && nums[i]>0 && nums[i] != nums[nums[i]-1]) {
                temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1 ) {
                return j+1;
            }
        }
        return nums.length+1;
    }



    public static void main(String[] args) {
        int[] nums = {}; 
        System.out.println(missing(nums));
    }
}
