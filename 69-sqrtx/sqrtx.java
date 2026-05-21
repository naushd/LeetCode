class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Use long to avoid overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }

            // Move right
            if (square < x) {
                ans = mid;
                left = mid + 1;
            }

            // Move left
            else {
                right = mid - 1;
            }
        }

        return ans;

    }
}