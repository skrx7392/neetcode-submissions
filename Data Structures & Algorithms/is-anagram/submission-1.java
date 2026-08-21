class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            if(!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), 1);
                continue;
            }
            int counter = map1.get(s.charAt(i));
            map1.put(s.charAt(i), counter + 1);
        }
        for(int i=0; i<t.length(); i++) {
            if(!map1.containsKey(t.charAt(i))) {
                return false;
            }
            int counter = map1.get(t.charAt(i));
            if(counter==1) {
                map1.remove(t.charAt(i));
                continue;
            }
            map1.put(t.charAt(i), counter-1);
        }
        return true;
    }
}
