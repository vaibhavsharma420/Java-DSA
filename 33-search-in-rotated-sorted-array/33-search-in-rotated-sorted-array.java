class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> maps= new HashMap<>();
        for(int i=0;i<nums.length;i++)
            maps.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        {
            if(maps.containsKey(target))
                return maps.get(target);
            
        }
        return -1;
        
    }
}