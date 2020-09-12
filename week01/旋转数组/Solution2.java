public class Solution2{
	public void rotate(int[] nums, int k) {
        int len=nums.length;
        int[] temps=new int[len];
        for(int i=0;i<len;i++){
            temps[(i+k)%len]=nums[i];
        }
        for(int i=0;i<len;i++){
            nums[i]=temps[i];
        }
    }
}