class Solution {
    public int[] twoSum(int[] nums, int target) {
        int abc[]=new int[2];
        HashMap<Integer,Integer> map= new HashMap<>();
        int g=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                abc[0]=i;
                abc[1]=map.get(target-nums[i]);
            }
            else 
                map.put(nums[i],i);
        }
        return abc;
        
    }
}