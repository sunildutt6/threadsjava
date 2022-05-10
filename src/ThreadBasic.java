
public class ThreadBasic {

	public static void main(String[] args) {

		Thread t = new Thread();
		System.out.println(t);
		t.setName("Shaktiman");
		t.setPriority(4);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(Thread.currentThread().getName());
	}

}
//Thread[Thread-0, 5, main]
//5(priority of thread)
//main(method associated to the thread)