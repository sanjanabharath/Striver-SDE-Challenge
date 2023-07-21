//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2, index = 0;
        if(nums.length == 1){
            return 1;
        }

        for(int i = 0; i <= nums.length-3; i++){
            if(nums[i]!=nums[i+2])
            {
                nums[index] = nums[i];
                k++;
                index++;
            }
        } 

        nums[index] = nums[nums.length-2];
        nums[index+1] = nums[nums.length-1];

        return k;
    }
}
