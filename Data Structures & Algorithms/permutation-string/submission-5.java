class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int p[]=new int[26];
        int w[]=new int[26];
        int l=0;
        int k=s1.length();
        for(int i=0;i<k;i++){
            char ch=s1.charAt(i);
            p[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            char chr=s2.charAt(r);
            w[chr-'a']++;
            if(r-l+1==k){
                if(Arrays.equals(p,w)){
                return true;
            }
                char chl=s2.charAt(l);
                w[chl-'a']--;
                l++;
            }
        }
        return false;
    }
    //     int l=0;
    //     int r=0;
    //     int formed=0;
    //     int freq[]=new int[26];
    //     for(int i=0;i<s1.length();i++)
    //     {
    //     freq[s1.charAt(i)-'a']++;
    //     }
    //     while(r<s2.length())
    //     {
        
    //         if(freq[s2.charAt(r)-'a']>0)
    //         {freq[s2.charAt(r)-'a']--;
    //          formed++;
    //         }
        
    //       if(formed==s1.length())
    //        return true;
    //                  System.out.println("l="+s2.charAt(l)+"r="+s2.charAt(r)+"f="+formed);

    //       if(r-l+1==s1.length())
    //       {
    //                     freq[s2.charAt(l)-'a']++;
    //           if(freq[s2.charAt(l)-'a']>0)
    //         {
    //          formed--;
    //         }
    //         l++;
    //       }
    //       r++;
    //     }
    //     return false;
    // }
}
