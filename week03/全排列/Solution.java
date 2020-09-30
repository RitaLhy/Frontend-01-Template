class Solution{
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        boolean[] used=new boolean[nums.length];
        List<Integer> temp=new ArrayList<Integer>();
        operPermute(nums,used,0,temp,res);
        return res;
    }
    private void operPermute(int[] nums, boolean[] used,int currentIndex, List<Integer> temp, List<List<Integer>> res) {
        if(temp.size()==nums.length){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                temp.add(nums[i]);
                used[i]=true;
                operPermute(nums,used,i,temp,res);
                used[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}