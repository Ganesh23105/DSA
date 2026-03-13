class Solution {

    public long maxHeight(long T, int t){
        long left = 0, right = 100000;
        long ans = 0;

        while(left <= right){
            long mid = (left + right) / 2;

            long time = (long)t * mid * (mid + 1) / 2;

            if(time <= T){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return ans;
    }

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long)1e18;
        long ans = right;

        while(left <= right){

            long mid = (left + right) / 2;

            long total = 0;

            for(int t : workerTimes){
                total += maxHeight(mid, t);

                if(total >= mountainHeight) break;
            }

            if(total >= mountainHeight){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;
    }
}