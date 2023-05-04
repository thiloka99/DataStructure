/* Class BinTreeNode */
 class BinTreeNode{
     BinTreeNode leftChild, rightChild;
     Integer val;
 
     public BinTreeNode(){
         leftChild = null;
         rightChild = null;
         val = null;
     }
     
     public BinTreeNode(int v){
         leftChild = null;
         rightChild = null;
         val = v;
     }
     
     public void setLeftChild(BinTreeNode n){
         leftChild = n;
     }
     
     public void setRightChild(BinTreeNode n){
         rightChild = n;
     }
     
     public BinTreeNode getLeftChild(){
         return leftChild;
     }
     
     public BinTreeNode getRightChild(){
         return rightChild;
     }
     
     public void setVal(int v){
         val = v;
     }
     
     public int getVal(){
         return val;
     }     
 }
 
