class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
          return "";
        int r=0;
        int l=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
         freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i),0)+1); 
        }
        int have=0;
        int need=freq.size();
        int minWin=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(r<s.length())
        {
           if(freq.containsKey(s.charAt(r)))
            { 
            freq.put(s.charAt(r),freq.get(s.charAt(r))-1);
            if(freq.get(s.charAt(r))==0)
              have++;
            }
            while(have==need)
            {
              if(r-l+1<minWin)
              {
                minWin=r-l+1;
                 start=l;
                 end=r;
              }
               
               if(freq.containsKey(s.charAt(l)))
               {                        freq.put(s.charAt(l),freq.get(s.charAt(l))+1);
               
   if(freq.get(s.charAt(l)) == 1)
                 have--;
               }
               l++;
            }
            
           r++;
        }
        return minWin==Integer.MAX_VALUE?"":s.substring(start,end+1);
    }
}
