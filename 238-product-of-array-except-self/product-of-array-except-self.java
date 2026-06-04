class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        int[] result = new int[nums.length];

        int prefix = 1;
        leftArray[0] = 1;

        for(int i = 1; i < nums.length ; i ++){
            prefix = prefix * nums [i-1];
            leftArray[i] = prefix;
        }

        int postfix = 1;
        rightArray[nums.length - 1] = 1;

        for(int i = nums.length - 2; i >= 0 ; i--){
            postfix = postfix * nums[i+1];
            rightArray[i] = postfix;
        }

        for(int i = 0; i < nums.length ; i++){
            result[i] = leftArray[i] * rightArray[i];
        }

     return result;     
    }
}