class Operations extends Thread{
	
	public void run() {
		if(Thread.currentThread().getName().equals("Addition")) {
			add();
		}else if(Thread.currentThread().getName().equals("subtraction")) {
			sub();
		}else if(Thread.currentThread().getName().equals("Multiplication")) {
			mul();
		}else {
			div();
		}
	}
	
	
	void add() {
		System.out.println("Addition is executed");
	}
	void sub() {
		System.out.println("subtraction is executed");
	}
	void mul() {
		System.out.println("Multiplication is executed");
	}
	void div() {
		System.out.println("Division is executed");
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		Operations op1 = new Operations();
		Operations op2 = new Operations();
		Operations op3 = new Operations();
		Operations op4 = new Operations();
		
		op1.setName("Addition");
		op2.setName("subtraction");
		op3.setName("Multiplication");
		op4.setName("Division");
		
		op1.start();
		op2.start();
		op3.start();
		op4.start();
		
	}
}
