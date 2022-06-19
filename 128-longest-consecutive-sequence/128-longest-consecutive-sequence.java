class Solution {
    public int longestConsecutive(int[] nums) {
        
        // If the array is empty
        if(nums.length == 0){
            return 0;
        }
        
        //We will take a HashMap of <Integer, Boolean> where boolean represents whether an element is the starting point of any sequence or not.
        
        //So initially, we will assume that every number is a starting point of it's sequence.
        
	   HashMap <Integer, Boolean> map = new HashMap<>();
	   for(int val: nums){
	       map.put(val, true);
	   }
	   
        //Next, we will check if a number lesser than the number in the array is present or not i.e, in test case [100,4,200,1,3,2], is there a number smaller than 100 (99)? No. So, it will be marked true.
        
        // Is there a number lesser than 4 (3)? Yes, So it will be marked false;
        // Is there a number lesser than 3(2) ? Yes, So, it will be marked false;
        //and so on...
	   for(int val: nums){
	       if(map.containsKey(val-1)){
	           map.put(val, false);
	       }
	   }
	   
	   int count = 1;
	   for(int val: nums){
           
           //Now, we will only be checking for the numbers that were marked true
	       if(map.get(val) == true){
	           int tempLen = 1;
	           int tempStartPos = val;
	           
	           while(map.containsKey(tempLen + tempStartPos)){
	               tempLen++;
	           }
	           
	           count = Math.max(tempLen, count);
	       }
	   }
	   
	   return count;
    }
}