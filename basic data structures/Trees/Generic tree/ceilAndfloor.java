
static int ceil;
  static int floor;
  public static void ceilAndFloor(Node node, int data) {
    if(node.data>data){
        //ceil
        if(node.data<ceil){
            ceil=node.data;
        }
    }
    if(node.data<data){
        //floor
        if(node.data>floor){
            floor=node.data;
        }
    }
    //traversal
    for(Node child: node.children){
        ceilAndFloor(child,data);
    }
  }