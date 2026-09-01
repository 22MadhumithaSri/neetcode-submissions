class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> count= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for(Integer value:count.values())
             {
                if(value>1)
                  return true;
             }
         return false;
    }
}