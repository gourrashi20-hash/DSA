class Solution {
    public int[] nextGreaterElements(int[] nums) {
       Stack<Integer> s=new Stack<>();
       int res[]=new int[nums.length];
       Arrays.fill(res,-1);
       for(int i=2*nums.length-1;i>=0;i--){
        int idx=i%nums.length;
        while(!s.isEmpty() && nums[s.peek()] <= nums[idx]){
            s.pop();
        }
        if(i<nums.length && !s.isEmpty()){
           res[idx] = nums[s.peek()];
        }
        s.push(idx);
       }
        
        return res;
    }
}