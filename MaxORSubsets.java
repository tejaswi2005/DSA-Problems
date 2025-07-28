class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int n = nums.length;
        int maxOr = 0;

        for(int num : nums){
            maxOr = maxOr | num;

        }
        return solve(nums, 0, maxOr, 0);
    }

    int solve(int nums[], int index, int maxOr, int currentOr){
        //Base Condition
        if( index >= nums.length){
            return currentOr == maxOr ? 1 : 0;
        }

        // Option 1: Include current element
        int take = solve(nums, index+1, maxOr, currentOr |nums[index]);

        // Option 2: Skip current element
        int notTake = solve(nums, index+1, maxOr, currentOr);

        return take + notTake;
    }
}
