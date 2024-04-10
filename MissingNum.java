public class MissingNum {
    public static int missingNumber(int[] nums) {
        int temp;
        int i=0;
        while(i<nums.length){
            if (nums[i]!=i && nums[i]<nums.length){
                temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
                else{
                    i++;
            }
        }
            for (int j=0;j<nums.length;j++){
                if (j!=nums[j]){
                    return j;
                }
            }
            return nums.length;
}

    public static void main(String[] args) {
        int[] nums = { 3,0,1 };
        System.out.println(missingNumber(nums));
    }
}
