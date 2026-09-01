class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> sortedMap=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String sorted=sortedString(strs[i]);
            sortedMap.putIfAbsent(sorted,new ArrayList<>());
            sortedMap.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(sortedMap.values());
    }
    public String sortedString(String word)
    {
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        String sorted=new String(chars);
        return sorted;
    }
}
