class Solution {
    public boolean isIsomorphic(String s, String t) {
       
       if(s.length()!=t.length()){
return false;
       }
        
       
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        int count1=1;
        int count2=1; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if(!map1.containsKey(ch)) {
                map1.put(ch, count1);
                count1++;
            }
        }
        for(int j=0;j<t.length();j++){
             char ch=t.charAt(j);
            if(!map2.containsKey(ch)) {
                map2.put(ch, count2);
                count2++;
            }
        }

for(int i=0;i<s.length();i++){
    // if(!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))){
    //     return false;
    // }
    int a=map1.get(s.charAt(i));
    int b=map2.get(t.charAt(i));
    if(a!=b){
        return false;
    }
}
        return true;
    }
}