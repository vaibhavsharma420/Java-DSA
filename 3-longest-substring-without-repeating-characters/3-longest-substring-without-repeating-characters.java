class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;int len=0;
        int max=0;
        HashSet<Character> map= new HashSet<>();
        while(j<s.length())
        {
            if(!map.contains(s.charAt(j)))
            {
                map.add(s.charAt(j));
                j++;
                max=Math.max(map.size(),max);
            }
            else
            {
                map.remove(s.charAt(i));
                i++;
            }
        }
        
        
        return max;
    }
}