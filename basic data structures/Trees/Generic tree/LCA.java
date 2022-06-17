public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    if (node.data == data) {
      ArrayList<Integer> path = new ArrayList<>();
      path.add(node.data);
      return path;
    }

    for (Node child : node.children) {
      ArrayList<Integer> ptc = nodeToRootPath(child, data);
      if (ptc.size() > 0) {
        ptc.add(node.data);
        return ptc;
      }
    }

    return new ArrayList<>();
  }

  public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> v1 = nodeToRootPath(node,d1);
    ArrayList<Integer> v2 = nodeToRootPath(node,d2);
    int i = v1.size()-1;
    int j = v2.size()-1;
    int LCA = -1;
    while(i>=0 && j>=0){
        if(v1.get(i)!=v2.get(j))
            break;
        LCA = v1.get(i);
        
        i--;
        j--;
        
    }
    return LCA;
  }