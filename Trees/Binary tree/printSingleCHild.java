public static void printSingleChildNodes(Node node, Node parent){
    if(node==null){
        return;
    }
    if(node.left==null && node.right!=null){
        System.out.println(node.right.data);
    }
    if(node.right==null && node.left!=null){
        System.out.println(node.left.data);
    }
    printSingleChildNodes(node.left,parent);
    printSingleChildNodes(node.right,parent);
  }