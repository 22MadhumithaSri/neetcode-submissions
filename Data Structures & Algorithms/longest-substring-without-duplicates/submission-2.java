class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> duplicateCheck=new HashSet<>();
        int maxLength=0;
        int currentLength=0;
        int left=0;

        for(int i=0;i<s.length();i++)
        {
           while(duplicateCheck.contains(s.charAt(i)))
           {
              duplicateCheck.remove(s.charAt(left));
              left++;
              currentLength-=1;
           }

            duplicateCheck.add(s.charAt(i));
            currentLength++;
            if(currentLength>maxLength)
             maxLength=currentLength;
           
        }
        return maxLength;
    }
}
