class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int me=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
                me=nums[i];
            if(me==nums[i])
                count=count+1;
            else count=count-1;
        }
        
        return me;
        
    }
}