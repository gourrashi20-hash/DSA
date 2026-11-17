class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int res[]=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}