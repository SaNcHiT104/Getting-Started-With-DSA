public static void allPath(ArrayList<Edge>[] graph , int src,int dest,boolean [] vis,String psf){
    if(src==dest){
        System.out.println(psf+src);
        return;
    }
    vis[src]=true; //we need all path
    for(int i=0;i<graph[src].size();i++){
        Edge e = graph[src].get(i);
        int nbr = e.nbr;
        if(vis[nbr]==false){
            allPath(graph,nbr,dest,vis,psf+src);
        }
    }
    vis[src]=false; 
}