import java.util.Scanner;
class Queue{
	static final int size = 5;
	String QArray[] = new String[size];
	int front = 0; 
	int rear = -1;
	
	boolean isEmpty(){
		if(rear == -1){
			//System.out.println("Queue is Empty");
			return true;
		}
		else{
			return false;
		}
	}
	boolean isFull(){
		if(rear == size-1){
			//System.out.println("Queue is Full");
			return true;
		}
		else{
			return false;
		}
	}
	void enQueue(String data){
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			//rear = rear+1;
		    QArray[++rear] = data;
		}
	}
	/*void deQueue(){ //part I in pop (deQueue)
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			QArray[front] = "";
			front++;
			if(front > rear){
				front = 0;
				rear = -1;
			}
		
		}
	}*/
	void moveRear(){ //part II in pop (deQueue)
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			for(int i=0; i<rear; i++){
				QArray[i] = QArray[i+1];
			}
			QArray[rear] = "";
			rear--;
		}
	}
	void peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else{
			System.out.println("first element = "+QArray[front]);
		}
	}
	void print(){
		for(int i=front; i<=rear; i++){ // rear eka wenakan ne print karanne not size 
			System.out.print(QArray[i]+" ,");
		}
		System.out.println();
	}
	public static void main(String []args){
		//Scanner in = new Scanner(System.in);
		Queue qq = new Queue();
		
		qq.enQueue("e1");
		qq.enQueue("e2");
		qq.enQueue("e3");
		qq.enQueue("e4");
		qq.enQueue("e5");
		qq.print();
		qq.peek();
		
		qq.moveRear();
		qq.print();
		qq.enQueue("e6");
		qq.enQueue("e7");
		qq.print();
		qq.moveRear();
		qq.print();
		qq.peek();
	}
}