lass Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack <Character> ch= new Stack(); char d;
        int n= x.length();
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)=='{'|| x.charAt(i)=='['|| x.charAt(i)=='('){
            ch.push(x.charAt(i));continue;}
            if(x.charAt(i)=='}' || x.charAt(i)==']'|| x.charAt(i)==')')
            {
                d= ch.peek();
                if(x.charAt(i)==d)
                ch.pop();
                
                
            }
        }
        
        if(ch.isEmpty())
        return true;
        else return false;
        
    }
}
