class Solution {
  StringBuilder encoded=new StringBuilder();
    public String encode(List<String> strs) {
    for(int i=0;i<strs.size();i++)
  {
    int length=strs.get(i).length();
    encoded.append(length);
        encoded.append('#');
    encoded.append(strs.get(i));
  }
  return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded=new ArrayList<>();
        int i=0;
      while(i<str.length())
      {
        int length=Integer.parseInt(str.substring(i,str.indexOf('#',i)));
        i=str.indexOf('#',i)+1;
        String word=str.substring(i,i+length);
        decoded.add(word);
        i=i+length;
      }
      return decoded;
    }
}
