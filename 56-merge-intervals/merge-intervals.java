class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            List<int []> result = new ArrayList<>();

            result.add(intervals[0]);

            for(int i = 1; i < intervals.length ; i++){

                int[] last = result.get(result.size() - 1);

                int currentStart = intervals[i][0];
                int currentEnd = intervals[i][1];

                if(last[1] >= currentStart){
                    last[1] = Math.max(last[1], currentEnd);
                }
                else {
                    result.add(intervals[i]);
                }
            }
            return result.toArray(new int[result.size()][]);
        }
}