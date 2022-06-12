public static void printKLevelsDown(Node root, int k){
    if(root==null || k<0){
        return;
        
    }
    if(k==0){
        System.out.println(root.data);
        
    }
    printKLevelsDown(root.left,k-1);
    printKLevelsDown(root.right,k-1);
  }