class Tree{
	Object[] array;
	
	int count_pre = 0;
	int count_In = 0;
	int count_post = 0;
	
	public Tree(){
		array = new Object[128];
	}
	public boolean empty(){
		return (array[1] == null);
	}
	public int left(int i){
		return 2*i;
	}
	public int right(int i){
		return 2*i+1;
	}
	public int parent(int i){
		return i/2;
	}
	public Object getCargo(int i){
		if(i<1 || i >= array.length){
			return null;
		}else{
		return array[i];
		}
	}
	public void setCargo(int i, Object obj){
		count_In++;
		count_post++;
		count_pre++;
		if(i<1 || i >= array.length){
			return;
		}else{ 
		array[i] = obj;
		}
	}
	public void printPreOrder(int i){ // root,left,right
		if(getCargo(i) == null){
			return;
		}
		System.out.println(getCargo (i));
		printPreOrder (left(i));
		printPreOrder (right(i));
	}
	public void printInOrder(int i){ // left,root,right
		if(getCargo(i) == null){
			return;
		}
		printInOrder (left(i));
		System.out.println(getCargo (i));
		printInOrder (right(i));
	}
	public void printPostOrder(int i){// left,right,root
		if(getCargo(i) == null){
			return;
		}
		printPostOrder (left(i));
		printPostOrder (right(i));
		System.out.println(getCargo (i));
	}
	public void member(){
		System.out.println("No.of nodes in the PreOrder tree is = "+count_pre);
		System.out.println("No.of nodes in the InOrder tree is = "+count_In);
		System.out.println("No.of nodes in the PostOrder tree is = "+count_post);
	}
	public static void main(String[] args){
		
		Tree tree = new Tree();
		int root = 1;
		
		tree.setCargo(root, "cargo for root");
		tree.setCargo(tree.left (root), "cargo for left");
		tree.setCargo(tree.right (root), "cargo for right");
		
		System.out.println("PreOrder :- ");
		tree.printPreOrder(root);
		
		System.out.println("InOrder :- ");
		tree.printInOrder(root);
		
		System.out.println("PostOrder :- ");
		tree.printPostOrder(root);
		tree.member();
	}
}