class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        boolean bool = false;

        for(int i = 0; i<length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                bool = true;
                break;
            }
            else
            {
                bool = false;
            }

        }
        return bool;
    }
}