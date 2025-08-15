class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums1){
            list.add(num);
        }
        for(int num:nums2){
            list.add(num);
        }
        Collections.sort(list);

        int n=list.size();

        if(n%2==0){
            return ((list.get((n/2)-1))+list.get(n/2))/2.0;
        }
        else{
            return list.get(n/2);
        }
        // int n=nums1.length;
        // int m=nums2.length;
        // int merged[]=new int[m+n];
        // System.arraycopy(nums1,0,merged,0,n);
        // System.arraycopy(nums2,0,merged,n,m);
        // Arrays.sort(merged);
        // int target=merged.length;
        // if(target%2==1){
        //     return merged[target/2];
        // }else{
        //     int mid1=merged[target/2];
        //     int mid2=merged[(target/2)-1];
        //     return (mid1+mid2)/2.0;
        // }
    }

}