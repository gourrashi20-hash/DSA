
class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder result = new StringBuilder();
            int j = 0;

            while (j < s.length()) {
                char digit = s.charAt(j);
                int count = 0;

                while (j < s.length() && s.charAt(j) == digit) {
                    count++;
                    j++;
                }

                result.append(count);
                result.append(digit);
            }

            s = result.toString();
        }

        return s;
    }
}
