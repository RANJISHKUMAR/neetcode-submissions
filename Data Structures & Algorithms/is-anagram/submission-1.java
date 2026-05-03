class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> s_dic = new HashMap<>();
        HashMap<Character,Integer> t_dic = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!s_dic.containsKey(s.charAt(i))){
                s_dic.put(s.charAt(i),1);
            }else{
                s_dic.put(s.charAt(i), s_dic.get(s.charAt(i)) + 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            if(!t_dic.containsKey(t.charAt(i))){
                t_dic.put(t.charAt(i),1);
            }else{
                t_dic.put(t.charAt(i), t_dic.get(t.charAt(i)) + 1);
            }
        }
        if(s_dic.equals(t_dic))
        {
            return true;
        }
        return false;
    }
}
