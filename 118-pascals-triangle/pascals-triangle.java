class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle =new ArrayList<>();
        int n=numRows;
        for(int i=0;i<n;i++){
            List<Integer> rows =new ArrayList<>();
            int number=1;
            for(int j=0;j<=i;j++){
                rows.add(number);
                number=number*(i-j)/(j+1);
            }
            triangle.add(rows);
        }
        return triangle ;
        
    }
}