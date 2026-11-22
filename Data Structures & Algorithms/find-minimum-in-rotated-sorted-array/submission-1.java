class Solution {
    public int findMin(int[] nums) {
         int low=0;
         int high=nums.length-1; 
         int min=Integer.MAX_VALUE; 
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(nums[low]<nums[high])
          return Math.min(min,nums[low]);
        if(nums[low]<=nums[mid])
        {
           min=Math.min(min,nums[low]);
           low=mid+1;
        }
        else
        {
            min=Math.min(min,nums[mid]);
            high=mid-1;
        }
       }
        return min;
    
        // int l = 0;
        // int r = nums.length - 1;
        // int res = nums[0];

        // while (l <= r) {
        //     if (nums[l] < nums[r]) {
        //         res = Math.min(res, nums[l]);
        //         break;
        //     }

        //     int m = l + (r - l) / 2;
        //     res = Math.min(res, nums[m]);
        //     if (nums[m] >= nums[l]) {
        //         l = m + 1;
        //     } else {
        //         r = m - 1;
        //     }
        // }
        // return res;
    }
}
