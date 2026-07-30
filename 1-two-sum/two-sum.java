class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [][]num=new int[nums.length][2];
        for (int i=0;i<num.length;i++){
            num[i][0]=nums[i];
            num[i][1]=i;
        }
        Arrays.sort(num,(a,b)->a[0]-b[0]);
        int left=0;
        int right=num.length-1;
        while(left<right){
            if(num[left][0]+num[right][0]==target){
                return new int []{num[left][1],num[right][1]};
            }
            else if(num[left][0]+num[right][0]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[] {-1,-1};
    }
}