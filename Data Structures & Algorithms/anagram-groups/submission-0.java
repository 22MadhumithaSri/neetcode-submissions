class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> sortedMap=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String sorted=sortedString(strs[i]);
            if(sortedMap.containsKey(sorted))
             {
                List<String> stringList=sortedMap.get(sorted);
                stringList.add(strs[i]);
            }
            else{
            List<String> stringList=new ArrayList<>();
            stringList.add(strs[i]);
            sortedMap.put(sorted,stringList);
            }
        }
        List<List<String>> finalList=new ArrayList<>();
        for(List<String> stringList:sortedMap.values())
        {
            finalList.add(stringList);
        }
        return finalList;
    }
    public String sortedString(String word)
    {
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        String sorted=new String(chars);
        return sorted;
    }
}
