class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxCount = 1;  // at minimum, one element is a sequence
        int count = 1;     // current sequence length starts at 1

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;              // skip duplicates
            } else if (nums[i] - nums[i-1] == 1) {
                count++;               // consecutive! grow the sequence
            } else {
                count = 1;             // gap found, reset to 1 (not 0!)
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}