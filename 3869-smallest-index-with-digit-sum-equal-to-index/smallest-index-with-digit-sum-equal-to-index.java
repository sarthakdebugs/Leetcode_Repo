class Solution {
    public int smallestIndex(int[] nums) {
        int digitSum = 0;
        
        for(int i = 0; i<nums.length; i++){
            digitSum = 0;
            while(nums[i]!=0){
            int lastdigit = nums[i]%10;
            digitSum = lastdigit + digitSum;
            nums[i] = nums[i]/10;
            }
            if(digitSum == i){
                return i;
                
            }
        }
        return -1;
    }
}