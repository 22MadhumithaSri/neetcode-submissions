class Solution {

    public String encode(List<String> strs) {
     StringBuilder finalStr=new StringBuilder();
     for(int i=0;i<strs.size();i++)
     {
       int len=strs.get(i).length();
       finalStr=finalStr.append(len).append("#").append(strs.get(i));
     }
     System.out.println(finalStr);
     return finalStr.toString();
    }

    public List<String> decode(String str) {
      List<String> list=new ArrayList<>();
      int i=0;
      while(i<str.length())
      {
        int j=str.indexOf('#',i);
      int len=Integer.parseInt(str.substring(i,j));

      String s=str.substring(str.indexOf('#',i)+1,str.indexOf('#',i)+1+len);
      list.add(s);
      i= str.indexOf('#',i)+1+len; 
      }
      return list;
    }
}
