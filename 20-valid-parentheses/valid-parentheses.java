class Solution {
    public boolean isValid(String s) {
      
        Stack<Character> sh=new Stack<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='{'|| c=='['|| c=='('){
            sh.push(c);
        }else{
            if(sh.isEmpty()){
            return false;
            }
          if((sh.peek() == '(' && c == ')') ||
                   (sh.peek() == '[' && c == ']') ||
                   (sh.peek() == '{' && c == '}')) {
                    sh.pop();
                } 
            else{
                return false;
            }
        }
      }
    return sh.isEmpty();
    }
}