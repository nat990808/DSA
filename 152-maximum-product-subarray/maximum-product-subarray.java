class Solution {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int temp = nums[0], temp1 = nums[length-1];
        int max = nums[0], max1 = nums[length-1];
        if(length == 0)
        {
            return 0;
        }
        for(int i = 1; i<length; i++)
        {
            temp = nums[i]*temp;
            if(temp == 0 || (i == length-1 && temp<nums[length-1]))
            {
                temp = nums[i];
            }
            max = Math.max(temp, max);
        }
        for(int i = length-2; i>=0; i--)
        {
            temp1 = nums[i]*temp1;
            if(temp1 == 0 || (i == 0 && temp1<nums[0]))
            {
                temp1 = nums[i];
            }
            max1 = Math.max(temp1, max1);
        }
        max = Math.max(max, max1);
        return max;
    }
}