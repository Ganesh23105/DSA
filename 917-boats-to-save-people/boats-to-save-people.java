class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        int boats=0;
        Arrays.sort(people);
        while(i<=j){
            if(people[j]+people[i]<=limit){
                i++;
                j--;
                boats++;
            }
            else{
                j--;
                boats++;
            }
        }
        return boats;
    }
}