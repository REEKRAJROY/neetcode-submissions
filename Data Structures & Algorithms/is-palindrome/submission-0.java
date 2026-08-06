class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reverse = "";
        for(int element = s.length()-1; element >= 0; element--) {
            reverse+=s.charAt(element);
        }
        int position = 0;
        for(int element = 0; element < s.length(); element++) {
            if(s.charAt(element) != reverse.charAt(position++)) {
                return false;
            }
        }
        return true;
    }
}
