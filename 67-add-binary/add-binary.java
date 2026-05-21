class Solution {
    public String addBinary(String a, String b) {
         int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        String result = "";

        while( i >= 0 && j >= 0){

            int x = a.charAt(i) - '0';
            int y = b.charAt(j) - '0';

            int s = x + y + c;
            int r = s % 2;
            result = result.concat(Integer.toString(r));
            c = s / 2;
            --i;
            --j;

        }
        while (i >= 0){
            int x = a.charAt(i) - '0';
            int s = x + c;
            int r = s % 2;
            c =  s / 2;
            result = result.concat(Integer.toString(r));
            --i;
        }
        while (j >= 0){
            int y = b.charAt(j) - '0';
            int s = y + c;
            int r = s % 2;
            c =  s / 2;
            result = result.concat(Integer.toString(r));
            --j;
        }
        if(c == 1){
            result = result.concat(Integer.toString(c));
        }
        return new StringBuilder(result).reverse().toString();
    }
}