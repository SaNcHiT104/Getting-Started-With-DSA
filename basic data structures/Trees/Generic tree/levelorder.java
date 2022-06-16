public static void levelOrder(Node node){
    Queue<Node> qu = new LinkedList<>();
    qu.add(node);
    while(qu.size()>0){
        Node rem = qu.remove();
        System.out.print(rem.data + " ");
        for(Node child : rem.children){
           if(child.data!=-1){
               qu.add(child);
           }
        }
    }
    System.out.print(".");
  }

public static void levelOrderLinewise(Node node){
    Queue<Node> qu = new LinkedList<>();
    qu.add(node);
    while(qu.size()>0){
        int size = qu.size();
        while(size-->0){
            Node rem = qu.remove();
            System.out.print(rem.data + " ");
            for(Node child : rem.children){
                qu.add(child);
            }
        }
        System.out.println();
    }
   }
