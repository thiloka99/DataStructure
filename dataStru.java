class singlyLinkedList{
	
    class Node{
        int data;
	    Node next;
		
	    public Node(int data){
			this.data = data;
		    this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			//if list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		}
		else{
			//newNode will be added after tail such that 
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display(){
		Node current = head;
		if(head == null){
			System.out.println("List is empty");
		}
		while(current != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	public void addBeginning(int data){
		Node newNode1 = new Node(data);
		if(head == null){
			head = newNode1;
			tail = newNode1;
		}
		else{
			newNode1.next = head;
			head = newNode1;
		}
	}
	public void addPosition(int position, int value){
		Node newNode2 = new Node(value);
	    Node current = head;
		
		if(head == null){
			System.out.println("List is empty");
			head = newNode2;
			tail = newNode2;
		}
		else if(current == tail){
			tail.next = newNode2;
			tail = newNode2;
		}
		else{
			for(int i=0; i<position-2; i++){
				current = current.next;
			}
			newNode2.next = current.next;//should first other wise output go long
			current.next = newNode2;
			
		}
	}
	public void addEnd(int val){
		Node newNode3 = new Node(val);
		Node current = head;
		
		if(head == null){
			System.out.println("List is empty");
			head = newNode3;
			tail = newNode3;
		}
		else{
			int i=0;
			while(current.next != null){
				current = current.next;
				i++;
			}
			newNode3.next = current.next;
			current.next = newNode3;
			
		}
	}
	public void deleteBeginning(){
		Node current = head;
		if(head == null){
			System.out.println("Linked list is empty");
		}
		else{
			head = head.next;
		}
	}
	public void deletePosition(int position){
		Node current = head;
		if(head == null){
			System.out.println("Linked list is empty");
		}
		else{
			for(int i=0; i<position-2;i++){
				current = current.next;
			}
			current.next = current.next.next;
		}
	}
	public void deleteEnd(){
		Node current = head;
		if(head == null){
			System.out.println("Linked list is empty");
		}
		else{
			int i=0;
			while(current.next.next != null){
				current = current.next;
				i++;
			}
			current.next = null;
		}
	}
	/* public void search(int value) {
        Node current = head;
        int index = 1;
        boolean found = false;

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        while (current.next != null) {
            if (current.value == value) {
                found = true;
                break;
            }
            current = current.next;
            index++;
        }

        if (found) {
            System.out.printf("Found at index %d. \n", index);
        }
		else {
            System.out.println("Not found in the list.");
        }
    }*/
	public static void main(String args[]){
		singlyLinkedList sList = new singlyLinkedList();
		
		//add nodes to the list
		sList.addNode(5); //adding empty list
		sList.addNode(1);
		sList.addNode(3);
		sList.addNode(8);
		sList.addNode(2);
		sList.display();
		
		sList.addBeginning(20); //add the beginning
		sList.display();
		sList.addPosition(2,15); //add the position
		sList.display();
		sList.addEnd(30); // add the end
		sList.display();
		
		sList.deleteEnd(); //delete end
		sList.display();
		sList.deleteBeginning(); //delete beginning
		sList.display();
		sList.deletePosition(3); //delete position
		sList.display();
		
		/*sList.search(3);
		sList.display();*/
	}
}