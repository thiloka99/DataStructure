class stack{
	final int size = 7;
	int top = -1;
	int array[] = new int[size];
	
	boolean isEmpty(){
		return top<0;
	}
	boolean isFull(){
		return top == size-1;
	}
	void push(int data){
		if(isFull()){
			System.out.println("Stack is Full");
		}
		else{
			array[++top]=data;
		}
	}
	int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty");
			return 0;
		}
		else{
			return array[top--];
		}
	}
	int peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty,so no top element");
			return 0;
		}
		else{
			return array[top];
		}
	}
	void print(){
		for(int i=top; i>=0; i--){
			System.out.print(array[i]+" , ");
		}
		System.out.println();
	}
}
class main{
	public static void main (String []args){
		stack ss = new stack();
		ss.pop(); //(a)
		ss.peek(); //(b)
		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.push(40);
		ss.push(50);
		ss.push(60);
		ss.push(70);
		ss.print(); //(c)
		ss.pop(); 
		ss.pop(); //(d)
		System.out.println("Now top Element = "+ss.peek()); //(e)
		ss.print(); //(f)
		
	}
}