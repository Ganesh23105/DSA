class Solution {

    List<String> result = new ArrayList<>();

    public String getHappyString(int n, int k) {

        backtrack(n, "", ' ');

        if(k > result.size()) return "";

        return result.get(k - 1);
    }

    public void backtrack(int n, String curr, char prev){

        if(curr.length() == n){
            result.add(curr);
            return;
        }

        char[] arr = {'a','b','c'};

        for(char c : arr){

            if(c == prev) continue;

            backtrack(n, curr + c, c);
        }
    }
}
