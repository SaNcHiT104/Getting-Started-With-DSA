public static int max;
    public static int maxNode;
    public static int sumOfGt(Node root){
        int sum=0;
        for(Node child:root.children){
           sum+=sumOfGt(child);
        }
        sum+=root.data; //root ka bhi sum add krna hai
        if(sum>max){
            max=sum;
            maxNode=root.data;
        }
        return sum;
    }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    max = -(int)1e9;
    maxNode = -1;
    sumOfGt(root);
    System.out.println(maxNode +"@"+max);
  }

}