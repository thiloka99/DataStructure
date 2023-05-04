//https://www.gstatic.com/ui/v1/activityindicator/loading_24.gif
public class MyArrayList {

    private static final int ArraySize = 5;

    private Integer data[];
    private int avail;    // available position
    private int asize;

    public MyArrayList(){
        this.data = new Integer[ArraySize];
        this.asize = ArraySize;

        this.avail = 0;      // Initially the list is empty
    }
    
    public MyArrayList(int asize){
        this.data = new Integer[asize];
        this.asize = asize;

        this.avail = 0;      // Initially the list is empty
    }

    public void insert(Integer val){
        if(this.avail == this.asize-1){
            increaseListSize(ArraySize);
        }
		data[avail]=val;
		avail = avail+1;

        // Complete the code here to insert the 'val' at 'avail'
    }

    public void insertAt(Integer val, int i){
		for(int j=avail; j>=i; j--){ //avail = asize-1;
			data[j]=data[j-1];
			
		}
		data[i]=val;
		avail++;
        // Complete the code here to insert the 'val' at 'i' th position
    }

    private void increaseListSize(int incSize) {
        this.asize = this.asize + incSize;
		Integer temData[] = new Integer[asize];
		for(int i=0; i<ArraySize; i++){
			temData[i]=data[i];
		}
		this.data=temData;
        // Complete the code here to increase the list size

        System.out.println("*** List length increased to: "+this.asize);
    }

    public void printList() {
        for(int i=0; i<avail; i++){
			System.out.print(data[i]+" , ");
		}
        // Complete the code here to print all the elements 

    }
	
    public void printElement(int i) {
       System.out.println(i+" element is :"+data[i-1]);
        // Complete the code here to print the 'i' th element 

    }

    public void remove(int i) throws Exception{
        if(i>this.avail-1){
            throw new Exception("Invalid Array Index");
        }
        if(i<0){
            throw new Exception("Negative Index");
        }
        System.out.println("Data getting removed:" + this.data[i]);
        
        // Complete the code here to remove the i th element from the list
		for(int j=i; j<avail; j++){
			data[j]=data[j+1];
		}
		avail--;
    }


    public void removeLast(){
        avail=avail-1;
		
        // Complete the code here to remove the last element
    }

    public static void main(String[] args) throws Exception {
        MyArrayList mylist = new MyArrayList();
        mylist.insert(21);
        mylist.insert(42);
        mylist.insert(25);
        mylist.insert(69);
        mylist.insert(53);
        mylist.insert(48);
		mylist.printList();
		System.out.println();

        mylist.printElement(2);

        mylist.remove(2); 
		mylist.printList();
		System.out.println(); 

        mylist.insertAt(94,2);		
		mylist.printList();
		System.out.println();
		
        mylist.removeLast();
        mylist.printList();
	
		
      
    }
}
