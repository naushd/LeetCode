class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ){
            return false;
        }
        String s = Integer.toString(x);
        int j = s.length()-1;
        for (int i = 0 ; i < j; i++, j--){
            char f = s.charAt(i);
            char e = s.charAt(j);
            if (f != e){
                return false;
            }
        }
        return true;
    }
}