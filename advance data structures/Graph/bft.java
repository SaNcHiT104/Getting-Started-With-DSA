public static void bft(ArrayList<Edge>[] graph, int src){
    boolean [] vis = new boolean[graph.length];
    
    Queue<pair> qu = new LinkedList<>();
    
    //seeding
    qu.add(new pair(src, src+""));
    
    while(qu.size() != 0){
        pair rem = qu.remove();
        if(vis[rem.u]){
            continue;
        }
        
        vis[rem.u] = true;
        System.out.println(rem.u + "@" + rem.asf);
        
        for(Edge e : graph[rem.u]){
            int nbr = e.nbr;
            
            if(!vis[nbr]){
                qu.add(new pair(nbr, rem.asf + nbr));
            }
            
        }
    }
}