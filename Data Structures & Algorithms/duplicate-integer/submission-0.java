class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> temp = new HashSet<>();
        
        for (int i=0; i<n; i++){
            if (temp.contains(nums[i])){
                return true;
            }
            temp.add(nums[i]);
        }
        return false;
    }
}