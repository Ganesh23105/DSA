class Solution {
    public int countPrimes(int n) {
        int limit=n;
        int[] arr=new int[n+1];
        for(int i=2;i<limit;i++){
            arr[i]=1;
        }

        for(int i=2;i<Math.sqrt(limit);i++){
            if(arr[i]==1){
                for(int j=i*i;j<limit;j+=i){
                    arr[j]=0;
                }
            }
        }

        int count=0;
        for(int i=0;i<n+1;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;





        // if (n < 2) {
        //     return 0;
        // }

        // boolean[] composite = new boolean[n]; // false means prime
        // int limit = (int) Math.sqrt(n);

        // for (int i = 2; i <= limit; i++) {
        //     if (!composite[i]) {
        //         // Mark all multiples of i as composite
        //         for (int j = i * i; j < n; j += i) {
        //             composite[j] = true;
        //         }
        //     }
        // }

        // int count = 0;
        // for (int i = 2; i < n; i++) {
        //     if (!composite[i]) {
        //         count++;
        //     }
        // }

        // return count;
    }
}
