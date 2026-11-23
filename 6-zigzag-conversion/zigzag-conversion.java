class Solution {
   public String convert(String s, int numRows) {

           if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows ; i++){
            sb[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()){

            sb[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows - 1){
                goingDown = !goingDown;
            }
            currentRow = currentRow + (goingDown? 1 : -1);
        }
        StringBuilder result = new StringBuilder();

        for (StringBuilder t  : sb){
            result.append(t);
        }
        return result.toString();
    }
}