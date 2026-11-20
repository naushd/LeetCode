class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int left = 0;
        // int right = numbers.length -1;
        // while(left < right){
        //     int sum = numbers[left] + numbers[right];
        //     if(sum == target){
        //         return new int[]{left+1, right+1};
        //     } else if (sum < target) {
        //         left++;
        //     }else {
        //         right--;
        //     }
        // }
        // return new int[]{-1, -1};

        HashMap<Integer, Integer> map = new HashMap<>();
        int temp;
        for (int i = 0; i < numbers.length ; i++){
            temp = target - numbers[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp), i+1};
            }
            map.put(numbers[i], i+1);
        }
        return new int[]{-1, -1};
    }
}