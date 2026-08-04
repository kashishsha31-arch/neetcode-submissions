class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map1=new HashMap<>();
        int n=(nums.length)/2;
        for(int i=0;i<nums.length;i++)
        {
         map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);

        }
        for(int i=0;i<nums.length;i++)
        {
            if(map1.get(nums[i])>n)
            {
                return nums[i];
            }

        }
       return -1;
    }
}