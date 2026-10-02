package in.thread;

public class Demo1 implements Runnable {
	public void run() {
		System.out.println("run() Method Start");

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());

		System.out.println("run() Method Ended");
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		Thread t = new Thread(d);
		t.start();
		//t.run();
	}
}

//	public void run() {
//		System.out.println("run() method start()");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("run() method end");
//	}
//
//	public static void main(String[] args) {
//		Demo1 d = new Demo1();
//		Thread t1 = new Thread(d);
//		t1.setPriority(Thread.MAX_PRIORITY);
//		t1.setName("Thread-1");
//		
//		Thread t2 = new Thread(d);
//		t2.setPriority(Thread.NORM_PRIORITY);
//		t2.setName("Thresd-2");
//		
//		Thread t3 = new Thread(d);
//		t3.setPriority(Thread.MIN_PRIORITY);
//		t3.setName("Thread-3");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//	}
//	
//
//}
	
//	public class Demo1 implements Runnable {
//
//		public synchronized void printNums() {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println(Thread.currentThread().getName() + "=> " + i);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		}
//
//		public void run() {
//			printNums();
//		}
//
//		public static void main(String[] args) {
//			Demo1 d = new Demo1();
//
//			Thread t1 = new Thread(d);
//			t1.setName("Thread-1");
//			t1.start();
//
//			Thread t2 = new Thread(d);
//			t2.setName("Thread-2");
//			t2.start();
//		}
//	}
