
public static void hamiltonian(ArrayList<Edge>[] graph, boolean [] vis, int src, int osrc, String asf){
    if(asf.length() == graph.length){
        System.out.print(asf);

        //path or cycle
         for(Edge e : graph[osrc]){
             int nbr = e.nbr;

             if(nbr == src){
                 //cycle
                 System.out.println("*");
                 return;
             }
         }
         System.out.println(".");
         return;

    }


    vis[src] = true;

     for(Edge e : graph[src]){
         int nbr = e.nbr;

         if(!vis[nbr]){
             hamiltonian(graph,vis, nbr, osrc, asf + nbr);
         }
     }


    vis[src] = false;

}
