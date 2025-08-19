class Solution {
    public int minimumOperations(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        int n = nums.length;
        if(n == 0 || n == 1){
            return 0; 
        }

        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                return (int)Math.ceil((i + 1) / 3.0);
            }
            set.add(nums[i]);
        }

        return 0;
    }
}
