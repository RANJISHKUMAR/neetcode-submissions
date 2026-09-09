class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> dict = new HashMap();
        int i = 0;
        for(int num : nums){
            int compliment = 0; 
            compliment = target - num;
            if(dict.containsKey(compliment)){
                return new int[] {dict.get(compliment),i};
            }
            dict.put(num,i);
            i++;
        }
        return new int[] {};
    }
}
