class Solution {
    public int longestConsecutive(int[] nums) {
         int longest = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            set.add(num);

        }

        for(int n : set){

            int length = 1;

            if (!set.contains(n - 1)){

                while (set.contains(n + length)){
                    length++;
                }

            }
            longest = Math.max(longest, length);

        }

        return longest;
    }
}