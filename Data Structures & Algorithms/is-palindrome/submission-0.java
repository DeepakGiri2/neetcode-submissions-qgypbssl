class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
            char Left,Rigth;
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }
            Left = Character.toLowerCase(s.charAt(left));
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            Rigth = Character.toLowerCase(s.charAt(right));
            if(Left != Rigth)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
