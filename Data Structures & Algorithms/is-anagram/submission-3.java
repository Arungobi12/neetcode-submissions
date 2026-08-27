class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,0);
        }
        for(char a:t.toCharArray()){
            if(s.length() != t.length()){
                return false;
            }
            if(! map.containsKey(a)){
                return false;
            }
        }
        return true;
    }
}
