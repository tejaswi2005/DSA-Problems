class Solution {
    public int countHillValley(int[] nums) {
        int i = 0;
        int cnt = 0;
        for(int j = 1; j < nums.length-1; j++){ 
            if((nums[j] > nums[i] && nums[j] > nums[j+1]) || 
            (nums[j] < nums[i] && nums [j] < nums[j+1])){
                cnt++;
                i = j; 
            }
        }
        return cnt;
    }
}
