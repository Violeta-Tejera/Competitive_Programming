class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> num_map = new HashMap<>();
        int complementario;

        for(int i = 0; i < nums.length; i++){
            complementario = target - nums[i];

            if(num_map.containsKey(complementario)){
                return new int[] {num_map.get(complementario), i};
            }

            num_map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
