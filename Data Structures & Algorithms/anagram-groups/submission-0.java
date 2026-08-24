class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, List<String>> resultMap = new HashMap<String, List<String>>();
        for(int i=0; i<strs.length; i++) {
            String hashString = buildHash(strs[i]);
            List<String> buckets = resultMap.getOrDefault(hashString, new ArrayList<String>());
            buckets.add(strs[i]);
            resultMap.put(hashString, buckets);
        }
        result.addAll(resultMap.values());
        return result;
    }

    private String buildHash(String str) {
        char[] charString = str.toCharArray();
        char[] charCounter = new char[26];
        for(int i=0; i<charString.length; i++) {
            charCounter[charString[i] - 'a']++;
        }
        return new String(charCounter);
    }
}
