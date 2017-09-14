package thread;

/**
 * Runnable
 * 使用Thread类的确是可以方便的进行多线程的实现，
 * 但是这种方式最大的缺点就是单继承的问题，为此，在java之中也可以利用Runnable接口来实现多线程
 */
public class TestRunnable {
	public static void main(String[] args) {
		MyThread2 thread1 = new MyThread2("线程A");
		MyThread2 thread2 = new MyThread2("线程B");
		MyThread2 thread3 = new MyThread2("线程C");

		new Thread(thread1).start();
		new Thread(thread2).start();
		new Thread(thread3).start();
	}
}

class MyThread2 implements Runnable{
	private String title;

	public MyThread2(String title) {
		this.title = title;
	}

	@Override
	public void run() {
		for(int i = 0;i<50;i++){
			System.out.println(title+ "运行："+i);
		}
	}
}
