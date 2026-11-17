class Solution {
    public boolean isValid(String s) {
        boolean isTrue=true;
        Stack<Character> sh=new Stack<>();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='{'|| c=='['|| c=='('){
            sh.push(c);
        }else{
            if(sh.isEmpty()){
                isTrue=false;
                break;
            }
          if((sh.peek() == '(' && c == ')') ||
                   (sh.peek() == '[' && c == ']') ||
                   (sh.peek() == '{' && c == '}')) {
                    sh.pop();
                } 
            else{
                isTrue=false;
                break;
            }
        }
      }
      if(!sh.isEmpty()){
        isTrue=false;
      }  
      return isTrue;
    }
}