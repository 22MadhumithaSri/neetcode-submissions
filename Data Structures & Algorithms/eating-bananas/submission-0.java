class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            double totalhrs=0;
            for(int i=0;i<piles.length;i++)
            {
                  totalhrs+=Math.ceil((double)piles[i]/mid);
            }
            if(totalhrs<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}

