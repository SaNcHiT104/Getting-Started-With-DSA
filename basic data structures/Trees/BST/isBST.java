public static class pairBST{
    boolean isBST;
    int min;
    int max;
    pairBST(){}
    pairBST(boolean isBST, int min, int max){
        this.isBST = isBST;
        this.min = min;
        this.max = max;
    }
}


public static pairBST isBST_(Node root){
    if(root == null){
        return new pairBST(true, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    
    pairBST leftAns = isBST_(root.left);
    pairBST rightAns = isBST_(root.right);
    
    pairBST myPair = new pairBST();
    
    myPair.isBST = (leftAns.isBST == true) && rightAns.isBST && leftAns.max <root.data && root.data < rightAns.min;
    myPair.min = Math.min(root.data, leftAns.min);
    myPair.max = Math.max(root.data, rightAns.max);
    
    
    return myPair;
}
