class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
         return 0; 
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++)
           set.add(nums[i]);
           int count=1;
           int maxx=0;
        for(int num:set)
        {
          if(!set.contains(num-1))
           {int cur=num;
             while(set.contains(cur+1))
             { 
              cur++;
              count++;
             }
           }
           if(count>maxx)
             maxx=count;
           count=1;
        }
        return maxx;
        // TreeSet<Integer> numSet=new TreeSet<>();
        // for(int i=0;i<nums.length;i++)
        //   numSet.add(nums[i]);
        // int cur=1;
        // int count=1;
        // int maxCount=0;
        // Integer[] num=numSet.toArray(new Integer[0]);
        // while(cur<num.length)
        // {
        //     if(num[cur]==num[cur-1]+1)
        //      { 
        //       count++;
        //      }
        //     else
        //     {
        //       if(count>maxCount)
        //         maxCount=count;
        //       count=1;
        //     }
        //    cur++;
        // }
        //  if(count>maxCount)
        //         maxCount=count;
        // return maxCount;
    }
}
