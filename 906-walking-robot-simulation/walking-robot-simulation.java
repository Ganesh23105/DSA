class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx={0,1,0,-1};
        int[] dy={1,0,-1,0};

        int dir=0;
        int x=0,y=0;
        int maxdist=0;

        Set<String> set=new HashSet<>();
        for(int[] obs:obstacles){
            set.add(obs[0]+","+obs[1]);
        }
        for(int cmd:commands){
            if(cmd==-1){
                dir=(dir+1)%4;
            }else if(cmd==-2){
                dir=(dir+3)%4;
            }else{
                for(int i=0;i<cmd;i++){
                    int nx=x+dx[dir];
                    int ny=y+dy[dir];

                    if(set.contains(nx+","+ny)){
                        break;
                    }

                    x=nx;
                    y=ny;

                    maxdist=Math.max(maxdist,x*x+y*y);
                }

            }
        }
        return maxdist;
    }
}