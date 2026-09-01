class Solution {
    public boolean isValid(String s) {
        Stack<Character> validStore=new Stack<>();
        Map<Character,Character> brackets=new HashMap<>();
        brackets.put('{','}');
        brackets.put('[',']');
        brackets.put('(',')');
        for(char chars:s.toCharArray())
        {
            if(brackets.containsKey(chars))
              validStore.push(chars);
            if(brackets.containsValue(chars))
            {
                if(validStore.isEmpty())
                  return false;
                if(chars==brackets.get(validStore.peek())) 
                  validStore.pop();
                else
                  return false;
            }

        }
        if(validStore.isEmpty())
          return true;
        else
        return false;
    }
}
