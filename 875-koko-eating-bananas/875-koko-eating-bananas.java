class Solution {
public int minEatingSpeed(int[] piles, int h) {
int max=0;
int speed=0;

    for(int i=0;i<piles.length;i++)
    {
        max=Math.max(piles[i],max);
    }
    
    if(piles.length==h)
        return max;
    
    int low = 1;
    int high= max;
    
    while(low<=high)
    {
        int mid=low+(high-low)/2;
        
        double num=0;
        int neededTime=0;
        
        for(int i=0;i<piles.length;i++)
        {
            num=(double)piles[i]/(mid);
            
            if(num>piles[i]/mid)
                neededTime += num+1;
            else
                neededTime += num;
        }
        
        if(neededTime<=h)
        {
            speed = mid;
            high = mid-1;
        }
        else
            low = mid+1;
    }
    
    return speed;
}
}