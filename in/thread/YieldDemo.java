package in.thread;

public class YieldDemo {
	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.start();
		consumer.start();
	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Consumer : Consumed Item " + i);
			Thread.yield();
		}
	}
}
