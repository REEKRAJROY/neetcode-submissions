class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int element = 0; element < nums.length; element++){
            if (numMap.containsKey(target - nums[element])) {
                return new int[] {numMap.get(target - nums[element]), element};
            }
            numMap.put(nums[element],element);
        }
        return nums;
    }
}
