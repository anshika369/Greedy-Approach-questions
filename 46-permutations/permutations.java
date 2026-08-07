class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        recpermute(nums,ans,ds,vis);
        return ans;
           
        
    }
    private static void recpermute(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] vis){
        if(ds.size()==nums.length){
           ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                vis[i]=true;
                ds.add(nums[i]);
                recpermute(nums,ans,ds,vis);
                ds.remove(ds.size()-1);
                vis[i]=false;
            }
        }
    }
}