package in.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//public class Demo {

//	public static void main(String[] args) throws Exception {
//		Thread t1 = new Thread() {
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					System.out.println(Thread.currentThread().getName() + " => " + i);
//				}
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//			}
//
//		};
//		t1.setName("Thread-1");
//
//		Thread t2 = new Thread() {
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					System.out.println(Thread.currentThread().getName() + " => " + i);
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO: handle exception
//						e.printStackTrace();
//					}
//				}
//			}
//		};
//		t2.setName("Thread-2");
//		t1.start();
//		t1.join();
//		t2.start();
//	}

//	public class Demo implements Runnable {
//
//		public void run() {
//			System.out.println("run () method started...");
//
//			Thread t = Thread.currentThread();
//			System.out.println(t.getName());
//
//			System.out.println("run () method ended...");
//		}
//
//		public static void main(String... args) {
//			Demo d = new Demo();
//
//			Thread t = new Thread(d);
//			t.start();
//			 t.run();
//		}
//	}

//public class Demo implements Runnable {
//
//	public void run() {
//		System.out.println("run () method started...");
//
//		try {
//			Thread.sleep(5000); // blocked state
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println("run () method ended...");
//	}
//
//	public static void main(String... args) {
//		Demo d = new Demo();
//
//		Thread t = new Thread(d); // new state
//		t.start(); // runnable state
//	}
//}

//public class Demo implements Runnable {
//
//	public void run() {
//		System.out.println("run () method started..." + Thread.currentThread().getName());
//		try {
//			Thread.sleep(15000); // blocked state
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("run () method ended..." + Thread.currentThread().getName());
//	}
//
//	public static void main(String... args) {
//		Demo d = new Demo();
//
//		Thread t1 = new Thread(d);
//		t1.setPriority(Thread.MAX_PRIORITY); // 10
//		t1.setName("Thread-1");
//
//		Thread t2 = new Thread(d);
//		t2.setPriority(Thread.NORM_PRIORITY); // 5
//		t2.setName("Thread-2");
//
//		Thread t3 = new Thread(d);
//		t3.setPriority(Thread.MIN_PRIORITY); // 1
//		t3.setName("Thread-3");
//
//		t1.start(); // runnable state
//		t2.start(); // runnable state
//		t3.start(); // runnable state
//	}
//}

//public class Demo implements Callable {
//
//	public Object call() throws Exception {
//		System.out.println("call ( ) - method executed...");
//		return "success";
//	}
//
//	public static void main(String[] args) throws Exception {
//		Demo d = new Demo();
//
//		ExecutorService exService = Executors.newFixedThreadPool(10);
//
//		for (int i = 1; i <= 15; i++) {
//			Future submit = exService.submit(d);
//			System.out.println(submit.get().toString());
//		}
//		exService.shutdown();
//	}
//}

//public class Demo implements Runnable {
//
//	@Override
//	public void run() {
//
//		if (Thread.currentThread().isDaemon()) {
//			System.out.println("Daemon Thread Executed...");
//		} else {
//			System.out.println("Normal Thread Executed...");
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		Thread t1 = new Thread(d);
//		t1.setDaemon(true);
//		t1.start();
//	}
//}

//public class Demo implements Runnable {
//
//	public synchronized void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(Thread.currentThread().getName() + "=> " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void run() {
//		printNums();
//	}
//
//	public static void main(String[] args) {
//		Demo d = new Demo();
//
//		Thread t1 = new Thread(d);
//		t1.setName("Thread-1");
//		t1.start();
//
//		Thread t2 = new Thread(d);
//		t2.setName("Thread-2");
//		t2.start();
//	}
//}

public class Demo {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setName("Thread-1");

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + " => " + i);
					try {
						Thread.sleep(100);
						Thread.yield();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.setName("Thread-2");

		t1.start();
		t1.join();
		t2.start();
	}
}
