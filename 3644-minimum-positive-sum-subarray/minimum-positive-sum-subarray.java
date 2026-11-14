class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = nums.size();
        for(int k=l;k<=r;k++){
            int sum = 0;
            for(int i=0;i<k;i++){
                sum = sum + nums.get(i);
            }
            if(sum>0){
                min = Math.min(min,sum);
            }
            for(int j=k;j<n;j++){
                sum+=nums.get(j)-nums.get(j-k);
            if(sum>0){
                min = Math.min(min,sum);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
    }
    }
}