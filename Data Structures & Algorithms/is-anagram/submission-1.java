class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> wordCount = new HashMap<>();
        for (char word : s.toCharArray()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (char word : t.toCharArray()) {
            if (wordCount.get(word) == null)
                return false;
            if(wordCount.get(word)==1)
              wordCount.remove(word);
            else
              wordCount.put(word,wordCount.get(word)-1);
        }
        if(wordCount!=null && !wordCount.isEmpty())
                return false;
        return true;
    }
}
