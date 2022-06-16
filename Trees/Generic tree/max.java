public static int max(Node node) {
    int max = Integer.MIN_VALUE;
    for(Node child : node.children){
        int currmax = max(child);
         max = Math.max(max,currmax);
    }
    return Math.max(max,node.data);
  }

//height
public static int height(Node node) {
    int h=-1;
    
    for(Node child : node.children){
       int currh = height(child);
       h = Math.max(h,currh);
    }
    return h+1;
  }