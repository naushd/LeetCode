class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        s = s.replaceAll("\\s+", " ");

        String[] t = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = t.length-1; i >= 0 ; i--){

            sb.append(t[i]);

            if(i != 0){
                sb.append(" ");
            }
            

        }
        return sb.toString();
    }
}