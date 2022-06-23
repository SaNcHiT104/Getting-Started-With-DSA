public static boolean hasPath(ArrayList<Edge>[] graph, int src,int dest,boolean [] vis){
    if(src==dest){
        return true;
    }
    vis[src]=true;
    for(int i=0;i<graph[src].size();i++){
        Edge e = graph[src].get(i);
        int nbr = e.nbr;
        if(vis[nbr]==false){
            boolean recAns = hasPath(graph,nbr,dest,vis);
            if(recAns){
                return true;
            }
        }
    }
    return false;
    
}