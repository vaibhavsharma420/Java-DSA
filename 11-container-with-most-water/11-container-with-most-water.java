class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int a=height.length-1;
        int b=0;
        while(b<a)
        {
            if(height[b]<height[a])
            {
                max=Math.max(max,height[b]*(a-b));
                b++;
            }
            else
            {
                 max=Math.max(max,height[a]*(a-b));
                a--;
            }
        }
        return max;
        
        
    }
}