class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        
        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i = 0; i < sb.length ; i ++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        int len = s.length();
        
        while (i < len) {
            
            for(int idx = 0;  idx < numRows && i < len; idx++, i++){
                sb[idx].append(c[i]);
            }

            for(int idx = numRows - 2; idx >= 1 && i < len ; idx--, i++){
                sb[idx].append(c[i]);
            }
        }
        for( i = 1; i < numRows ; i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}