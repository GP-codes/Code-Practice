class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> solMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if(solMap.containsKey(complement))
            {
                return new int[] {solMap.get(complement), i};
            }

            solMap.put(nums[i], i);

        }
        return new int[]{};
    }
}
