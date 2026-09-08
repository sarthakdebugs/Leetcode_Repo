class Solution {
    public int countCommas(int n) {
        int commaCount = 0;
        if(n<1000){
            commaCount = 0;
        }
        if(n>=1000){
            commaCount = n-999;
        }
        if(n>1000000){
            commaCount = n-999999;
        }
        return commaCount;
    }
}