class Solution {
    public boolean judgeCircle(String moves) {
        int horiz=0;
        int vertical=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='R')horiz++;
            else if(ch=='L')horiz--;
            else if(ch=='U')vertical++;
            else vertical--;
        }
        return horiz==0 && vertical==0;
    }
}