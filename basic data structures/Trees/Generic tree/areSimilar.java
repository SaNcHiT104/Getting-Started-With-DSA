public static boolean areSimilar(Node n1, Node n2) {
    if(n1.children.size()!=n2.children.size()){
        return false;
    }
    for(int i=0;i<n1.children.size();i++){
        Node v1 = n1.children.get(i);
        Node v2 = n2.children.get(i);
        if(!areSimilar(v1,v2)){
            return false;
        }
        
    }
    return true;
  }