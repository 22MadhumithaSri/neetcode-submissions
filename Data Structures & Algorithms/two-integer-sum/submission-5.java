class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> targetMap=new HashMap<>();
        int[] res=new int[2]; 
        for(int i=0;i<nums.length;i++)
        {
            if(targetMap.containsKey(target-nums[i]))
               {
                   res[0]=targetMap.get(target-nums[i]);
                   res[1]=i;
                   return res;
               } 
            targetMap.put(nums[i],i);
        }
        return res;
    }
}
