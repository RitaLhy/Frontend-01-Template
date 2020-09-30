class Solution{
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>(k);
        oper(n,k,1,temp,res);
        return res;
    }

    private void oper(int n, int k, int begin, List<Integer> temp, List<List<Integer>> res) {
        if(temp.size()==k){
            res.add(new ArrayList<Integer>(temp));
            System.out.println("加入的内容："+temp);
            return;
        }
        for(int j=begin;j<=n;j++){
            temp.add(j);
            oper(n,k,j+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }

}