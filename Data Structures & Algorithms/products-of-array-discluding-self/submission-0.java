class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] ans=new int[nums.length];
        int curleft=1;
        for(int i=0;i<nums.length;i++)
        {
          left[i]=curleft;
          curleft=curleft*nums[i];
        }
        curleft=1;
        for(int i=nums.length-1;i>=0;i--)
        {
          right[i]=curleft;
          ans[i]=right[i]*left[i];
          curleft=curleft*nums[i];
        }
        return ans;
    }
}  
