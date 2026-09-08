class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> result=new HashSet<>();
     Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
        int j=i+1;
        int k=nums.length-1;
        while(j<k)
        {
          //int sum=0;
          if(nums[i]==-(nums[j]+nums[k]))
          {
            List<Integer> temp=new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(nums[k]);
             result.add(temp);
             j++;
             k--;
          }
          else if(nums[i]>-(nums[j]+nums[k]))
          {
            k--;
          }
          else
          {
            j++;
          }
        }
      }
      return new ArrayList<>(new ArrayList<>(result));
        // ArrayList<Integer> finalList=new ArrayList<>();
        //  Set<List<Integer>> finalSet=new HashSet<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     Set<Integer> set=new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         int sum=-nums[i]-nums[j];
        //         if(set.contains(sum))
        //           {
        //             ArrayList<Integer> temp=new ArrayList<>(List.of(nums[i],nums[j],sum));
        //             Collections.sort(temp);
        //             finalSet.add(temp);
        //           }
        //         else
        //           set.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(new ArrayList<>(finalSet));
    }
}
