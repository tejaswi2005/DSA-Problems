class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            //check if all numbers in an array are -ve & then return max -ve number
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }

            //if array include +ve & -ve then return maxSum
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);

        }

        if (maxNumber < 0) {
            return maxNumber;
        } else {
           return maxSum;
        }
    }
}
