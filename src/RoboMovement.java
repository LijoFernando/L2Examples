public class RoboMovement {
    public static void main(String[] args) {
        RoboMovement rb= new RoboMovement();
        System.out.println(rb.judgeCircle("UD"));
    }
        public boolean judgeCircle(String moves) {
            char[] move = {'R','L','U','D'};
            int [][] stepCount ={{1,0},{-1,0},{0,1},{0,-1}};
            int[] roboOrigin ={0,0};
            int[] roboEnd ={0,0};
            int j=0;
            while(j<moves.length()){
                for(int i=0;i<move.length;i++) {
                    if(moves.charAt(j)==move[i]) {
                        roboOrigin[0]=roboOrigin[0] +stepCount[i][0];
                        roboOrigin[1]=roboOrigin[1] +stepCount[i][1];
                        j++;
                        break;
                    }
                }
            }
            System.out.println(roboOrigin[0]+" "+roboOrigin[1]);
            if(roboOrigin[0]==roboEnd[0] && roboEnd[1]==roboOrigin[1]){
                return  true;
            }
            return  false;
        }

}
