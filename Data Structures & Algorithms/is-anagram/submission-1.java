class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] chars = new int[26];
        for(char i : s.toCharArray())
        {
            chars[i - 'a']++;
        }
        for(char i :t.toCharArray())
        {
             chars[i - 'a']--;
        }
        for(int i : chars)
        {
            if(i!=0) return false;
        }
        return true;
    }
}
