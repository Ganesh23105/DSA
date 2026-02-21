class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        for(int i = left; i <= right; i++){
            count += (665772 >> Integer.bitCount(i)) & 1;
        }
        
        return count;
    }
}