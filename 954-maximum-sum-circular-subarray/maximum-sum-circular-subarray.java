class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int minSum = nums[0];
        int currentMin = nums[0];
        int total = nums[0];

        for(int i = 1; i < nums.length ; i++){

            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentSum);

            currentMin = Math.min(currentMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currentMin);

            total += nums[i];
        }

        if(maxSum < 0){
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}