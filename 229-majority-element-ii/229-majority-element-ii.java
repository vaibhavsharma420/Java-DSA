class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int num2=-1;
        int c1=0;int c2=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==num1)
                c1++;
            else if(nums[i]==num2)
                c2++;
            else if(c1==0){
                num1=nums[i];c1=1;}
            else if(c2==0)
            {
                num2=nums[i];
                c2=1;
            }
            else {
                c1--;
            c2--;}
        }
        List<Integer> ans= new ArrayList<Integer>();
        int p1=0;int p2=0;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==num1)
                p1++;
            else if(nums[i]==num2)
                p2++;
        }
        if(p1>len/3)
            ans.add(num1);
        if(p2>len/3)
            ans.add(num2);
        
        return ans;
        
    }
}