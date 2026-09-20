class Solution {
    public int reverseDegree(String s) {
        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int reverseValue = 'z' - c + 1;

            p += reverseValue * (i + 1);
        }

        return p;
    }
}
