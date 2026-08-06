class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr=new int[nums.length];
       
        int m=1;
        arr[0]=1;
      
        for(int j=1;j<arr.length;j++){
            m=m*nums[j-1];
            arr[j]=m;
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*right;
            right=right*nums[i];

        }

        return arr;
    }
}