class Operations implements Runnable{
	
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


public class ThreadDemoRunnable {

	public static void main(String[] args) {
		Operations op1 = new Operations();
		Operations op2 = new Operations();
		Operations op3 = new Operations();
		Operations op4 = new Operations();
		
		Thread t1 = new Thread(op1);
		Thread t2 = new Thread(op2);
		Thread t3 = new Thread(op3);
		Thread t4 = new Thread(op4);
		
		t1.setName("Addition");
		t2.setName("subtraction");
		t3.setName("Multiplication");
		t4.setName("Division");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
