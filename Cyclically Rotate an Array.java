
void rotate(int arr[], int n);

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n;
        scanf("%d",&n);
        int a[n] , i;
        for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        rotate(a, n);
        for (i = 0; i < n; i++)
            printf("%d ", a[i]);
        printf("\n");
    }
        return 0;
}
// } Driver Code Ends


void rotate(int arr[], int n)
{
   for(int i=0;i<n-1;i++)
    {
        arr[n-1]=arr[n-1]+arr[i];
        arr[i]=arr[n-1]-arr[i];
        arr[n-1]=arr[n-1]-arr[i];
    }
    
    
}