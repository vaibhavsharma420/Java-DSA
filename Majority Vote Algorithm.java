public class Main
{
    public static void main(String[] args) {
        
        int a[]={5,2,4,5,5};
    
        int ansIndex=0;int g=0;
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==a[ansIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                ansIndex=i;
                count=1;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[ansIndex]==a[i])
            g++;
        }
        if(g>((a.length)/2))
        System.out.println(a[ansIndex]);
    }

	    
		
	}

