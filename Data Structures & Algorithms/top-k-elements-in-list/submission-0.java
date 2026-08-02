class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: count frequency of each number
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Step 2: sort keys by frequency (highest first)
        List<Integer> keys = new ArrayList<>(count.keySet());
        keys.sort((a, b) -> count.get(b) - count.get(a));

        // Step 3: pick top k
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(i);
        }
        return res;
    }
}