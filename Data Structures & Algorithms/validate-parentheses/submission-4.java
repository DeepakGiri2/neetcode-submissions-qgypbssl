class Solution {
    public boolean isValid(String s) {
        Stack<Character> ck = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                ck.push(c);
            }
            else
            {
                if(ck.isEmpty()) return false;
                char ch = ck.pop();
                if(c == ')' && ch != '(')
                {
                    return false;
                }
                
                if(c == '}' && ch != '{')
                {
                    return false;
                }

                if(c == ']' && ch != '[')
                {
                    return false;
                }
            }
        }
        return ck.isEmpty();
    }
}
