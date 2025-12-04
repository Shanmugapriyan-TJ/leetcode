class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int [] minidist=new int [n];
        boolean [] visited=new boolean[n];
        Arrays.fill(minidist,Integer.MAX_VALUE);
        int cost=0;
        minidist [0]=0;
        for(int i=0;i<n;i++){
            int curr=-1;
            for(int j=0;j<n;j++){
                if(!visited[j] && (curr==-1||minidist[j]<minidist[curr])){
                    curr=j;
                }
            }
            visited[curr]=true;
            cost+=minidist[curr];
            for(int k=0;k<n;k++){
                if(!visited[k]){
                    int dist=Math.abs(points[curr][0]-points[k][0])+Math.abs(points[curr][1]-points[k][1]);
                    minidist[k]=Math.min(minidist[k],dist);
                }
            }
        }
        return cost;
        
    
    }
}