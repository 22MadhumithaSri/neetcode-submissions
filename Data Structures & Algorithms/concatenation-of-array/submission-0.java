class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=nums[i];
        }
        int j=nums.length;
          for(int i=0;i<nums.length;i++)
        {
            res[j]=nums[i];
            j++;
        }
        return res;
    }
}