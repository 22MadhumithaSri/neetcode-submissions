class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
          freq.put(s1.charAt(i),freq.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=0;
        int r=0;
        int formed=0;
        while(r<s2.length())
        {
            if(freq.containsKey(s2.charAt(r)))
            { if(freq.get(s2.charAt(r))>0)  
                 formed++;
                
                freq.put(s2.charAt(r),freq.get(s2.charAt(r))-1);   
               
                if(formed==s1.length())
             return true;
             
            }
         
           if( r - l + 1 == s1.length()){
            if(freq.containsKey(s2.charAt(l)))

                {                                  
                if(freq.get(s2.charAt(l))>=0)
                    formed--;
                freq.put(s2.charAt(l),freq.get(s2.charAt(l))+1);
                }
                l++;
    

            }
         r++;  
        }
        return false;
    }
}
