package thread;

/**
 * 多线程：Thread
 * java.lang.Thread是一个负责线程操作的类，任何的类只需要继承了Thread类就可以成为一个线程的主类，
 * 但是既然是主类必须有它的使用方法，而线程启动的主方法是需要覆写Thread类中的run()方法才可以。
 */
public class TestThread {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("线程A");
		MyThread thread2 = new MyThread("线程B");
		MyThread thread3 = new MyThread("线程C");
		/**
		 * 如果要想在程序之中真正的启动多线程，必须依靠Thread类的一个方法：
		 * public void start()，表示真正启动多线程，调用此方法后会间接调用run()方法。
		 */
		thread1.start();
		thread2.start();
		thread3.start();
		/**
		 * 要想启动线程必须依靠Thread类的start()方法执行，线程启动之后会默认调用了run()方法。
		 */
	}
}

class MyThread extends Thread{
	private String title;

	public MyThread(String title) {
		this.title = title;
	}

	public void run(){
		for(int i = 0;i<50;i++){
			System.out.println(title+"运行："+i);
		}
	}

}
