class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int b = 0;
        int l =0;
        int r =people.length -1;
        
      // traverse to add 2
     while(l <= r){
        if((people[l] + people[r]) <= limit){
            l++;

        }
      
        r--;
        b++;

     }

        return b;
    }
}