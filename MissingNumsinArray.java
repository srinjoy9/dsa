import java.util.ArrayList;

public class MissingNumsinArray {
    public static ArrayList<Integer> missing(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i+1 && nums[i]!=nums[nums[i] - 1]) {
                temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
             else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                list.add(j+1);
            }
        }
        return list; 
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(missing(nums));
    }
}
