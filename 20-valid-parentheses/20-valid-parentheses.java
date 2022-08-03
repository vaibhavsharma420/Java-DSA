class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
    /*for each character, if it's opening character '{','(','['
        then add into stack else get the top character from stack    and check with current character.
            if it's matches then remove the top char from stack 
            at last if the stack is empty then it's valid else it's not valid */   
        
        for(char ch : s.toCharArray()){
            
            if(ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else{
                if(!stack.empty()){
                    
                char topChar = stack.peek();
                
                if((ch=='}' && topChar=='{')||
                  (ch==')' && topChar=='(')||
                   (ch==']' && topChar=='[')){
                 
                    stack.pop();
                    
                }else{
                    return false;
                }
            }
                else{
                    return false;
                }
        }
    }
        if(stack.empty())
            return true;
        else
            return false;
}
}
        
    