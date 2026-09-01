class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
       Map<Character,Integer> wordCount=new HashMap<>();
      for(char word:s.toCharArray())
        {wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        System.out.println(wordCount.get(word));
        }
        
     for(char word:t.toCharArray())
{
    if(wordCount.get(word)==null)
        return false;
   wordCount.computeIfPresent(word,(k,v)->v-1);
} 
for(int word:wordCount.values())
{
    if(word!=0)
      return false;
}
     return true;   
    }
}
