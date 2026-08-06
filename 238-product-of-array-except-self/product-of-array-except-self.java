class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr=new int[nums.length];
        int [] brr=new int[nums.length];
        int m=1;
        arr[0]=1;
        int n=1;
        brr[nums.length-1]=1;
        for(int j=1;j<arr.length;j++){
            m=m*nums[j-1];
            arr[j]=m;
        }
        for(int k=nums.length-2;k>=0;k--){
            n=n*nums[k+1];
            brr[k]=n;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i]*brr[i];
        }

        return nums;
    }
}