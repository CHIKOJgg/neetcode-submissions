class Solution {
    public boolean isPalindrome(String s) {
       String st=  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        int r = 0;
        int l = st.length()-1;

        for( int i = 0; i<st.length()/2; i++){
        
            if (st.charAt(r)!=st.charAt(l))return false;
            r++;
            l--;
        }
        return true;
    }
}
