class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;

        int n = nums.length;

        int ContinuousCnt = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                ContinuousCnt++;
            } else {
                ContinuousCnt = 0;
            }
            result = result + ContinuousCnt;
        }

        return result;
    }
}
