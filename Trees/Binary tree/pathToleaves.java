public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
    if(node==null){
        return;
    }
    if(node.right==null && node.left==null){
        sum += node.data;
       if(sum>=lo && sum<=hi){
           path +=node.data;
           System.out.println(path);
       }
       return;
    }
    pathToLeafFromRoot(node.left,path + node.data + " ",sum + node.data,lo,hi);
    pathToLeafFromRoot(node.right,path + node.data + " ",sum + node.data,lo,hi);
  }