class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] indices=new int[2];
        // for(int i=0;i<nums.length;i++)
        // {
        //   for(int j=i+1;j<nums.length;j++)
        //   {
        //     if(nums[i]+nums[j]==target)
        //       {
        //         if(i<j)
        //          {indices[0]=i;
        //          indices[1]=j;}
        //         else
        //          {indices[0]=j;
        //          indices[1]=i;}
        //       return indices;
        //       }
        //   }
        // }
        // return indices;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] finalarray=new int[2];
        for(int i=0;i<nums.length;i++)
        {
          map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
          int t=target-nums[i];
          if(map.containsKey(t) && i!=map.get(t)){ 
             finalarray[0]=i;
             finalarray[1]=map.get(t);
             return finalarray;
          }
        }
return finalarray;
    }
}
