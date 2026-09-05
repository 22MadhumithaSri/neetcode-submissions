class Solution {
    public boolean isPalindrome(String s) {
        String k=s.trim().toLowerCase();
        int i=0;
        int j=k.length()-1;
        while(i<=j)
        {
            while(i<j && !Character.isLetterOrDigit(k.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(k.charAt(j))) j--;

            if(k.charAt(i)==k.charAt(j))
              {
                i++;
                j--;
              }
            else
              return false;
            
        }
        return true;
    }
}
