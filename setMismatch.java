import java.util.Arrays;
public class setMismatch {
    public static int[] mismatch(int[] nums) {
        int temp;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            
            } else if (nums[i] != i + 1 && nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] !=j+1 ) {
                return new int[] {nums[j],j+1};
            }
        }
        return new int[] {};
    }



    public static void main(String[] args) {
        int[] nums = {1,1}; //{1,2,3,4,3,2,7,8}
        System.out.println(Arrays.toString(mismatch(nums)));
    }
}
