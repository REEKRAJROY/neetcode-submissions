class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi = 1, zero = 1, countOfZeroes = 0;
        int[] copy =new int[nums.length];
        for(int element = 0; element < nums.length; element++) {
            multi *= nums[element];
            if (nums[element] == 0) {
                countOfZeroes++;
                continue;
            }
            if (countOfZeroes >= 2) {
                break;
            }
            zero *= nums[element];
        }
        if (countOfZeroes >= 2){
        for(int element = 0; element < nums.length; element++) {
            copy[element] = 0;
        }
        return copy;
        }
        for(int element = 0; element < nums.length; element++) {
            copy[element] = nums[element] == 0 ? zero :  multi/nums[element];
        }
        return copy;
    }
}  
