class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> triplets = new HashSet<>();
      Arrays.sort(nums);
      for(int i = 0; i < nums.length; i++)
      {
        Set<Integer> map = new HashSet<>();
        if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
        for(int j = i+1; j < nums.length; j++)
        { 
            int third = -(nums[i]+nums[j]);
            if(map.contains(third))
            {
                triplets.add(Arrays.asList(nums[i], nums[j], third));
            }
            if(!map.contains(third))
            {
                map.add(nums[j]);
            }
        }
      }
      List<List<Integer>> parent = new ArrayList<>(triplets);
      return parent;
    }
}