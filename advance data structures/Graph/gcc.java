public static void forsingle(ArrayList<Edge>[] graph,boolean [] vis,int src,ArrayList<Integer> single){
    single.add(src);
    vis[src]=true;
    for(Edge e : graph[src]){
        int nbr =e.nbr;
        if(!vis[nbr]){
            forsingle(graph,vis,nbr,single);
        }
    }
}
 public static void gcc(ArrayList<Edge>[] graph,ArrayList<ArrayList<Integer>> comp){
     boolean [] vis = new boolean[graph.length];
     for(int i=0;i<graph.length;i++){
         if(!vis[i]){
             ArrayList<Integer> single = new ArrayList<>();
             forsingle(graph,vis,i,single);
             comp.add(single);
         }
     }
 }