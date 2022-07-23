class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> cars= new HashSet<Integer>();
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cars.contains(nums[i]))
                return true;
            else cars.add(nums[i]);
        }
        return false;
    }
}
            