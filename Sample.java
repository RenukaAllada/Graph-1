class Sample{
    /***********************PROBLEM-1************/
//TC:0(M+N) m=length of trust matrix, n=no of people
//SC:0(N)
    class Solution {
        public int findJudge(int n, int[][] trust) {
            if(n==1){
                return n;
            }
            int[] scores=new int[n];
            for(int[] each:trust){
                scores[each[0]-1]--;
                scores[each[1]-1]++;
            }
            for(int i=0;i<scores.length;i++){
                if(scores[i]==n-1){
                    return i+1;
                }
            }
            return -1;
        }
    }

    
}
