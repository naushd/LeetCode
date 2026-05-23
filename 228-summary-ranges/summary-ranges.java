class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> res = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++){

            int current = nums[i];
            int temp = current;

            while ((i < nums.length) && (current == nums[i]) ){
                i++;
                current++;
            }

            i--;
            --current;

            if(temp == current){
                res.add(Integer.toString(current));
            }else {
                res.add(temp + "->" + current);
            }
        }
        return res;
    }
}