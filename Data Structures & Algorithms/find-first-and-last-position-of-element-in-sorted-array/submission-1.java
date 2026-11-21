class Solution {
    public int[] searchRange(int[] nums, int target) {
         int low=0;
        int high=nums.length-1;
        int first=-1;
        int second=-1;
        int firstOcc=first(nums,target,low,high,first);
        if(firstOcc==-1)
          return new int[]{-1,-1};
        int secondOcc=second(nums,target,low,high,second);
        return new int[]{firstOcc,secondOcc};
    }
    public int first(int[] nums,int target,int low,int high,int first)
    {
       
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
             {
                first=mid;
                high=mid-1;
             }
             else if(nums[mid]<target)
             {
                low=mid+1;
             }
             else
              high=mid-1;
        }
        return first;
    }
    public int second(int[] nums,int target,int low,int high,int second)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
             {
                second=mid;
                low=mid+1;
             }
             else if(nums[mid]<target)
             {
                low=mid+1;
             }
             else
              high=mid-1;
        }
        return second;
 }
}