class Solution {
    public int balancedStringSplit(String s) {
        int b=0;
        int cnt=0;
        for(char c : s.toCharArray()){
        if( c == 'R') b++;
        if(  c == 'L') b--;
        if( b == 0) cnt++;
     
           

        }
           return cnt;
    }
}