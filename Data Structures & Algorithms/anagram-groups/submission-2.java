class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap=new HashMap<>();
        for(String word:strs)
        {
           int[] count= new int[26];
           for(char chars:word.toCharArray())
           {  count[chars -'a']++;}
           String key=Arrays.toString(count);
           anagramMap.putIfAbsent(key,new ArrayList<>());
           anagramMap.get(key).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    //     Map<String,List<String>> sortedMap=new HashMap<>();
    //     for(int i=0;i<strs.length;i++)
    //     {
    //         String sorted=sortedString(strs[i]);
    //         sortedMap.putIfAbsent(sorted,new ArrayList<>());
    //         sortedMap.get(sorted).add(strs[i]);
    //     }
    //     return new ArrayList<>(sortedMap.values());
    // }
    // public String sortedString(String word)
    // {
    //     char[] chars=word.toCharArray();
    //     Arrays.sort(chars);
    //     String sorted=new String(chars);
    //     return sorted;
     }
}
