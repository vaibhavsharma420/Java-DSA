class Solution {
    public int findDuplicate(int[] nums) {
         Set<Integer> hash_Set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash_Set.contains(nums[i])){
                return nums[i];
            }
            else{
                hash_Set.add(nums[i]);
            }
        }
        return 0;
    }
}