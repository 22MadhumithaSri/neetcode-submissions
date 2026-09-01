class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> numSet=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
          numSet.add(nums[i]);
        int left=0;
        int right=0;
        int cur=1;
        int count=1;
        int maxCount=0;
        Integer[] num=numSet.toArray(new Integer[0]);
        while(cur<num.length)
        {
            if(num[cur]==num[cur-1]+1)
             { right++;
              count++;
             }
            else
            {
              left=right;
              if(count>maxCount)
                maxCount=count;
              count=1;
            }
           cur++;
        }
         if(count>maxCount && nums.length>0)
                maxCount=count;
        return maxCount;
    }
}
