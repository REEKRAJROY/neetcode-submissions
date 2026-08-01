class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String element: strs){
            int count[] = new int[26];
            for(char character: element.toCharArray()){
                count[character-'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(element); 
        }
        return new ArrayList<>(result.values());
    }
}
