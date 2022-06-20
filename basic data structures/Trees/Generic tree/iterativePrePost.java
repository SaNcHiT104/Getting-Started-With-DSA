public static class pair {
    Node node;
    int state;

    pair() {

    }

    pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }

}

public static void IterativePreandPostOrder(Node node) {
Stack<pair> st = new Stack<>();
st.push(new pair(node,-1));
String pre = "";
String post = "";
while(st.size()!=0){
    pair peekpair = st.peek();
    if(peekpair.state==-1){
        pre +=peekpair.node.data + " ";
        peekpair.state++;
    }
    else if(peekpair.state==peekpair.node.children.size()){
        post+=peekpair.node.data +" ";
        st.pop();
    }
    else{
        Node child = peekpair.node.children.get(peekpair.state);
        st.push(new pair(child,-1));
        peekpair.state++;
        
    }
}
System.out.println(pre);
System.out.println(post);
  
}