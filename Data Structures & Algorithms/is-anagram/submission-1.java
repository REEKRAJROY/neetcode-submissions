class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
        return false;
        }
        else {
            int count[] = new int[26];
            for (int position = 0; position < s.length(); position++){
                ++count[s.charAt(position)-'a'];
                --count[t.charAt(position)-'a'];
            }
            for (int position: count){
                if (position != 0){
                    return false;
                }
            }
                return true;
        }
    }
}
