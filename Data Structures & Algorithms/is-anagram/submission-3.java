class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> wordCount = new HashMap<>();
        for (char word : s.toCharArray()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (char word : t.toCharArray()) {
            Integer count=wordCount.get(word);
            if (count == null)
                return false;
            if(count==1)
              wordCount.remove(word);
            else
              wordCount.put(word,wordCount.get(word)-1);
        }
        if(wordCount!=null && !wordCount.isEmpty())
                return false;
        return true;
    }
}
