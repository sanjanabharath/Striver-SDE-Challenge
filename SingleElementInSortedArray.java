//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int right = nums.length-1;
        int left = 0;

        while(left < right){
            int mid = (left + right)/2;

            if(mid%2 == 1){
                mid--;
            }

            if(nums[mid] != nums[mid+1]){
                right = mid;
            }else{
                left = mid + 2;
            }
        }

        return nums[left];
    }
}
