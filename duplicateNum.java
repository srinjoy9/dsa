import java.util.*;

public class duplicateNum {
    public static ArrayList<Integer> duplicate(int[] nums) {
        ArrayList<Integer> list= new ArrayList<Integer>();
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
                list.add(nums[j]);
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1}; //{1,2,3,4,3,2,7,8}
        System.out.println(duplicate(nums));
    }
}
