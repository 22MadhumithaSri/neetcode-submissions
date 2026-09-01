class Solution {
    public boolean hasDuplicate(int[] nums) {
      Map<Integer,Integer> dup =new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        if(dup.get(nums[i])!=null && dup.get(nums[i])>=0)
          return true;
        dup.put(nums[i],dup.getOrDefault(nums[i]+1,0));
      }
      return false;
    }
}