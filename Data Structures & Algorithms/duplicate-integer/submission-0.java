
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<Integer>();

        for(int n: nums)
        {
            if(!unique.contains(n))
            {
                unique.add(n);
            }

            else
            {
                return true;
            }
            

        }

        return false;
    }
}