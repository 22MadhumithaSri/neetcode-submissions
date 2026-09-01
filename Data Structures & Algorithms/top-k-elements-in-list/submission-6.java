class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> freq=new HashMap<>();
     for(int i=0;i<nums.length;i++)
     {
        freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
     }
    List<Integer>[] bucket=new ArrayList[nums.length+1];
    System.out.println(freq);
    //int[] bucket=new int[nums.length+1];
     for(int num:freq.keySet())
     {
        int freque=freq.get(num);
        if(bucket[freque]==null)
        {
            bucket[freque]=new ArrayList<>();
        }
        bucket[freque].add(num);
     }
     int[] result=new int[k];
     int j=0;
     int n=bucket.length;
     for(int i=n-1;i>=0 && j<k;i--)
     {
        if(bucket[i]!=null)
       {
          for(int nu:bucket[i])
         {if(j==k)
          break;
            result[j]=nu;
            j++;
         }
        
       }
     }
     return result;
}
}