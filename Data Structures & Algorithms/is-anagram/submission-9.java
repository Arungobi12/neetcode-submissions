class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char[] a = s.toCharArray();
        int len1 = a.length;
        char[] b = t.toCharArray();
        int len2 = b.length;
        if(len1!=len2) {
            return false;
        }

        for(int i=0 ; i<a.length ; i++){
            map1.put(a[i],map1.getOrDefault(a[i],0)+ 1);
            map2.put(a[i],map2.getOrDefault(a[i],0)+ 1);
            map1.put(b[i],map1.getOrDefault(b[i],0)+ 1);
        }
        for(int i=0 ; i<a.length ; i++){
            if(map1.get(a[i]) % 2 != 0 || !map2.containsKey(b[i])){
                return false;
            }
        }
        return true;
    }
}