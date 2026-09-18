class Solution {
    public boolean isPalindrome(String s) {
       
        int r = 0;
        int l = s.length()-1;

        while (r < l) {
            while (r < l && !Character.isLetterOrDigit(s.charAt(r))) {
                r++;
            }
            while (r < l && !Character.isLetterOrDigit(s.charAt(l))) {
                l--;
            }
          
            if (Character.toLowerCase(s.charAt(r))
            != Character.toLowerCase(s.charAt(l))) {
                return false;
            }
            r++;
            l--;
        }
        return true;
    }
}
