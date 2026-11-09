class Solution {
    public int[] runningSum(int[] nums) {
     int sum=0;
     int[] nums1 =new int[nums.length];
     for(int i=0;i<nums1.length;i++){
        sum=sum+nums[i];
        nums1[i]=sum;
     }   
     return nums1;
    }
}