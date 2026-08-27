class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String s1 = new String(arr);

        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        String s2 = new String(arr1);

        for(char c:s1.toCharArray()){
            map.put(c,0);
        }
        for(char a:s2.toCharArray()){
            if(s.length() != t.length()){
                return false;
            }
            if(! map.containsKey(a)){
                return false;
            }
        }
        
        // for(char c:s1.toCharArray()){
        //     map.put(c,0);
        // }
        // for(char a:t.toCharArray()){
        //     if(s.length() != t.length()){
        //         return false;
        //     }
        //     if(! map.containsKey(a)){
        //         return false;
        //     }
        // }
        return true;
    }
}
