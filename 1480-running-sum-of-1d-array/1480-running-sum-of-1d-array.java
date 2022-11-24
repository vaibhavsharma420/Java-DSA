class Solution {
    public int[] runningSum(int[] nums) {
        int max=0;
        int arr[]= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            max= max+nums[i];
            
}
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]=max;
            max=max-nums[i];
        }
        return arr;
    }
}