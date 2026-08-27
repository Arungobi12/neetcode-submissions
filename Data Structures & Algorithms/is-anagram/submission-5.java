class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] a = s.toCharArray();
        int len1 = a.length;
        char[] b = t.toCharArray();
        int len2 = b.length;
        if(len1!=len2){
            return false;
        }

        for(int i=0 ; i<a.length ; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+ 1);
            map.put(b[i],map.getOrDefault(b[i],0)+ 1);
        }
        for(int i=0 ; i<a.length ; i++){
            if(map.get(a[i]) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}