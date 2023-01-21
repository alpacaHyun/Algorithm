package programmers.level1;

public class MinSquare {

    public int solution(int[][] sizes) {
        int maxW=0;
        int maxH=0;

        for(int i=0;i<sizes.length;i++){

            int width=Math.max(sizes[i][0],sizes[i][1]);
            int height=Math.min(sizes[i][0],sizes[i][1]);

            maxW=Math.max(maxW,width);
            maxH=Math.max(maxH,height);
        }

        return maxW*maxH;
    }
}
