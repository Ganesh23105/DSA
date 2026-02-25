class Solution {
    public int countbit(int n){
        int count=0;
        while(n>0){
            n=n & (n-1);
            count++;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
        Integer[] temp=new Integer[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }

        Arrays.sort(temp,(a,b)->{
            int count1=countbit(a);
            int count2=countbit(b);

            if(count1==count2){
                return a-b;
            }
            else return count1-count2;
        });

        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
        return arr;
    }
}