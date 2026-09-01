class Solution {
    public boolean hasDuplicate(int[] nums) {
      Map<Integer,Integer> dup =new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        if(dup.get(nums[i])!=null)
          return true;
        dup.put(nums[i],0);
      }
      return false;
    }
}