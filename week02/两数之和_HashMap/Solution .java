class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> maps=new HashMap<Integer,Integer>();
       int len=nums.length;
        for(int i=0;i<len;i++){
            int temp=target-nums[i];
            if(maps.get(temp)!=null){
                return new int[]{maps.get(temp),i};
            }
            maps.put(nums[i],i);
        }
        return null;
    }
}