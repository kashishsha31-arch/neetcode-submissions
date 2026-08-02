class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        //HIGH COMPLEXITY SOLUTION 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             return new int[]{i,j};
        //         }  
        //return null;
     HashMap <Integer,Integer> map1=new HashMap<>();
     for(int i=0;i<n;i++)
     {
        if(map1.containsKey(target-nums[i]))
        {
          return new int[]{map1.get(target-nums[i]),i};
        }
        else
        {
              map1.put(nums[i],i);
        }
     }
     return null;
     

    }
}
