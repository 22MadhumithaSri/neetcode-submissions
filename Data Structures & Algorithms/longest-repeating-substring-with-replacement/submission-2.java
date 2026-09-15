class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> freq=new HashMap<>();
        int maxFreq=0;
        int maxString=0;
        int l=0;
        int r=0;
        while(r<s.length())
        {
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            maxFreq=Math.max(maxFreq,freq.get(s.charAt(r)));
            if((r-l+1)-maxFreq<=k)
              maxString=Math.max(maxString,r-l+1);
            else
              {
               freq.put(s.charAt(l),freq.get(s.charAt(l))-1);
               l++;
              }
  
              r++; 
        }
        return maxString;
    }
}
