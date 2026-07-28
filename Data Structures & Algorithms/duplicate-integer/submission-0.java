class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dups = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            dups.add(nums[i]);
            if (dups.size() < i+1)
            return true;
        }
        return false;
    }
}