class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        Arrays.fill(res, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!s.isEmpty() && nums[s.peek()] <= nums[idx]) {
                s.pop();
            }

            if (i < n && !s.isEmpty()) {
                res[idx] = nums[s.peek()];
            }

            s.push(idx);
        }

        return res;
    }
}