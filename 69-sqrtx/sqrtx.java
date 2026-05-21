class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long left = 1 ;
        long right =  x;
        long mid = 0;
        int ans = 0;

        while (left <= right){

            mid = (left + right) / 2;

            long square =  mid * mid;

            if(square == x){
                return (int)mid;
            }

            if (square < x){
                ans = (int)mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }
        return ans;

    }
}