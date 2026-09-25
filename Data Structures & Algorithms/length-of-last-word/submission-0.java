class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i;
        int k=s.length()-1;
        for(i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
              continue;
            if(s.charAt(i)!=' ')
             { k=i;
             break;}
        }
        for(i=k;i>=0;i--)
{
            if(s.charAt(i)==' ')
              break;
            count++;
        }
        return count;
    }
}