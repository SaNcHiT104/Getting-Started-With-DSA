public static void mirror(Node node){
    for(Node child : node.children){
        mirror(child);
    }
    int i=0;
    int j=node.children.size()-1;
    while(i<j){
        Node v1 = node.children.get(i);
        Node v2 = node.children.get(j);
        node.children.set(i,v2);
        node.children.set(j,v1);
        i++;
        j--;
    }
  }