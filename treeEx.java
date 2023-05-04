class Tree_ex{
	Object[] array;
	
	Tree_ex(){
		array = new Object[50];
	}
	boolean empty(){
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
		System.out.print(getCargo(i)+" ,");
		printPreOrder (left(i));
		printPreOrder (right(i));
	}
	public void printInOrder(int i){ // left,root,right
		if(getCargo(i) == null){
			return;
		}
		printInOrder (left(i));
		System.out.print(getCargo(i)+" ,");
		printInOrder (right(i));
	}
	public void printPostOrder(int i){// left,right,root
		if(getCargo(i) == null){
			return;
		}
		printPostOrder (left(i));
		printPostOrder (right(i));
		System.out.print(getCargo(i)+" ,");
	}
	public static void main(String[] args){
		
		Tree_ex tree = new Tree_ex();
		int root = 1;
		
		tree.setCargo(1,"A");
		tree.setCargo(tree.left(1*root), "B");
		tree.setCargo(tree.right(1*root), "C");
		
		tree.setCargo(tree.left(2*root),"D");
		//tree.setCargo(tree.right(2*root),"_");
		tree.setCargo(tree.left(2*root+1),"E");
		//tree.setCargo(tree.right(2*root+1),"_");
		
		tree.setCargo(tree.left(4*root), "G");
		tree.setCargo(tree.right(4*root), "H");
		
		tree.setCargo(tree.left(8*root),"K");
		//tree.setCargo(tree.right(8*root),"_");
		tree.setCargo(tree.left(8*root+1),"L");
		tree.setCargo(tree.right(8*root+1),"M");
		
		
		System.out.println("PreOrder :- ");
		tree.printPreOrder(1);
		System.out.println();
		
		System.out.println("InOrder :- ");
		tree.printInOrder(1);
		System.out.println();
		
		System.out.println("PostOrder :- ");
		tree.printPostOrder(1);
		System.out.println();
	}
}