class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        int mid = 0, row = 0, col = 0;

        while (left <= right){

            mid = (left + right) / 2;

            row = mid / n;
            col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            }
            if(matrix[row][col] < target){

                left = mid + 1;

            }
            else {
                right = mid - 1;
            }

        }
        return false;
    }
}