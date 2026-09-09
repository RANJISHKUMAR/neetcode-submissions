class Solution {
    public boolean isAnagram(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        HashMap<Character,Integer> sdict = new HashMap();
        HashMap<Character,Integer> tdict = new HashMap();
        if(slen != tlen){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(sdict.containsKey(ch)){
                sdict.put(ch,sdict.getOrDefault(ch,0) +1);
            }
            else{
                sdict.put(ch,sdict.getOrDefault(ch,0) +1);
            }
        }
        for(char ch : t.toCharArray()){
            if(tdict.containsKey(ch)){
                tdict.put(ch,tdict.getOrDefault(ch,0) +1);
            }
            else{
                tdict.put(ch,tdict.getOrDefault(ch,0) +1);
            }
        }
        if(sdict.equals(tdict)){
            return true;
        }
        else{
            return false;
        }
    }
}
