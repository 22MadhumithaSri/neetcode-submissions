class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> finalList=new ArrayList<>();
         Set<List<Integer>> finalSet=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int sum=-nums[i]-nums[j];
                if(set.contains(sum))
                  {
                    ArrayList<Integer> temp=new ArrayList<>(List.of(nums[i],nums[j],sum));
                    Collections.sort(temp);
                    finalSet.add(temp);
                  }
                else
                  set.add(nums[j]);
            }
        }
        return new ArrayList<>(new ArrayList<>(finalSet));
    }
}
