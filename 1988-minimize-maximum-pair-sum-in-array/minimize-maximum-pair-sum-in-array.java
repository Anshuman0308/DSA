class Solution {
    public int minPairSum(int[] nums) {
     int  res =0;
        Arrays.sort(nums);
        int n = nums.length, total = 0;
        for (int i = 0; i < n; i ++) {
              res = Math.max(res, nums[n - 1 - i] + nums[i]);
        }

        return res;
    }
}