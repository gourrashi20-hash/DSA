class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list1 = new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
      for(int i=0;i<arr.length-1;i++){
        List<Integer> list = new ArrayList<>();
        int diff=Math.abs(arr[i]-arr[i+1]);
        if(diff<minDiff){
            minDiff=diff;
            list1.clear();
            list.add(arr[i]);
            list.add(arr[i+1]);
            list1.add(list);
        }
        else if(diff==minDiff){
            list.add(arr[i]);
            list.add(arr[i+1]);
            list1.add(list);
        }
        
      }
      return list1;
    }
}