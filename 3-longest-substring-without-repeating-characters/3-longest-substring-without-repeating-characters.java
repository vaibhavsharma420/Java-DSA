class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> maps= new HashSet<>();
        int a=0; int max=0;
        int b=0;
        while(b<s.length())
        {
           
            if(!maps.contains(s.charAt(b)))
            {
                maps.add(s.charAt(b));
                b++;
                max=Math.max(maps.size(),max);
            }
            else
            {
                maps.remove(s.charAt(a));
                a++;
            }
        }
        return max;
        
    }
}