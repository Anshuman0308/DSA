class Solution {
    public boolean checkValidString(String s) {
      
        int min = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                min++;
                max++;
            } 
            else if (s.charAt(i) == ')') {
                min--;
                max--;
            } 
            else { // '*'
                min--;
                max++;
            }

            // Minimum cannot go below 0
            if (min < 0) {
                min = 0;
            }

            // Even maximum cannot maintain balance
            if (max < 0) {
                return false;
            }
        }

        return min == 0;
    }
}
    