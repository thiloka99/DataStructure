class progression{
	protected long current;
	
	progression(){
		this(0);
	}
	public progression(long start){
		current = start;
	}
	public long nextValue(){
		long answer = current;
		advance();
		return answer;
	}
	protected void advance(){
		current++;
	}
	public void printProgression(int n){
		System.out.print(nextValue());
		for(int j=1; j<n; j++)
			System.out.print(" "+nextValue());
		System.out.println();
	}
}
	
class ArithmeticProgression extends progression{
	protected long increment;
	
	public ArithmeticProgression(){
		this(1,0);
	}
	public ArithmeticProgression(long stepsize){
		this(stepsize,0);
	}
	public ArithmeticProgression(long stepsize, long start){
		super(start);
		increment = stepsize;
	}
	protected void advance(){
		current += increment;
	}
}
class GeometricProgression extends progression{
	protected long base;
	
	public GeometricProgression(){
		this(2,1);
	}
	public GeometricProgression(long stepsize){
		this(stepsize,1);
	}
	public GeometricProgression(long stepsize, long start){
		super(start);
		base = stepsize;
	}
	protected void advance(){
		current *= base;
	}
}

class FibonacciProgression extends progression{
	protected long prev;

	public FibonacciProgression(){
		this(0,1);
	}
	/*public FibonacciProgression(long stepsize){
		this(stepsize,1);
	}*/
	public FibonacciProgression(long first, long second){
		super(second);  //current = second;
		prev = first;
	}
	protected void advance(){
		long temp = prev;
		prev = current;
		current = current+temp;

	}
}

class TestProgression{
	public static void main(String args[]){
		progression prog;
		
		/*System.out.print("Arithmetic progression with default increment: ");
		prog = new ArithmeticProgression();
		prog.printProgression(10);
		
		System.out.print("Arithmetic progression with default increment 5: ");
		prog = new ArithmeticProgression(5);
		prog.printProgression(10);
		
		System.out.print("Arithmetic progression with default increment 2: ");
		prog = new ArithmeticProgression(5,2);
		prog.printProgression(10);
		
		System.out.print("Geometric progression with default base:");
		prog = new GeometricProgression();
		prog.printProgression(10);*/
		
		System.out.print("Fibonacci progression with default start value:");
		prog = new FibonacciProgression();
		prog.printProgression(10);
		
		System.out.print("Fibonacci progression with default start value 4 and 6:");
		prog = new FibonacciProgression(4,6);
		prog.printProgression(10);
	}
}