class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] dup = new int[2];
        int len = nums.length;
        int[] count = new int[len+1];
        for (int i = 0; i < len; i++) 
        {
            count[nums[i]]++;
        }

        for (int i = 0; i < len+1; i++) {
            if(count[i] == 2)
                dup[0] = i;
            if(count[i] == 0)
                dup[1] = i;
        }

        return dup;
    }
}

