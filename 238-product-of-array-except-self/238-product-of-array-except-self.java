class Solution {
    public int[] productExceptSelf(int[] nums) {
    	int[] res = new int[nums.length];
    	int dummy=1;
    	for (int i=0;i<nums.length;i++) {
    		res[i]=dummy;
    		dummy*=nums[i];
    	}
        dummy=1;
    	for(int i=nums.length-1;i>=0;i--) {
    		res[i]*=dummy;
    		dummy*=nums[i];
    	}
    	return res;
    }
}