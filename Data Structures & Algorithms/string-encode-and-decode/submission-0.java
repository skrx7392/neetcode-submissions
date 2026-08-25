class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int pointer = 0;
        while (pointer < str.length()) {
            int delimFinder = pointer;
            while(delimFinder<str.length()) {
                if(str.charAt(delimFinder) != '#') {
                    delimFinder++;
                } else {
                    break;
                }
            }
            int counter = Integer.parseInt(str.substring(pointer, delimFinder));
            pointer = delimFinder + 1;
            result.add(str.substring(pointer, pointer + counter));
            pointer = pointer + counter;
        }
        return result;
    }
}
