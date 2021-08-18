public class Main
{
	public static void main(String[] args) {
	    


    int a[]={2,1,8,-3,6,4,12}; int i;
    int n=a.length;
    for(i=0;i<n-1;i++)
    {
        int minInd=i;
        for(int j=i;j<n;j++)
        {
            if(a[j]< a[minInd])
            minInd=j;
        }

     
    int temp=a[i];
    a[i]=a[minInd];
    a[minInd]=temp;
	}
    for(int item:a){
        System.out.println(item+ " ");
    }
    
}
}
