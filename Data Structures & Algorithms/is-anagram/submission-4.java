class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> wordCount = new HashMap<>();
        int i=0;
        while(i < s.length()){
            wordCount.put(s.charAt(i),wordCount.getOrDefault(s.charAt(i),0)+1);
            wordCount.put(t.charAt(i),wordCount.getOrDefault(t.charAt(i),0)-1);
            i++;
        }
        for(int nums:wordCount.values())
        {
            if(nums!=0)
               return false;
        }
        return true;
        // for (char word : s.toCharArray()) {
        //     wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        // }

        // for (char word : t.toCharArray()) {
        //     Integer count=wordCount.get(word);
        //     if (count == null)
        //         return false;
        //     if(count==1)
        //       wordCount.remove(word);
        //     else
        //       wordCount.put(word,wordCount.get(word)-1);
        // }
        // if(wordCount!=null && !wordCount.isEmpty())
        //         return false;
        // return true;
    }
}
