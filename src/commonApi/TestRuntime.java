package commonApi;

/**
 * Runtime类
 *   在每一个JVM进程之中，都会存在一个运行时的操作类的对象，而这对象所属的类型就是Runtime类。
 */
public class TestRuntime {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		System.out.println("1.MAX_MEMORY：" + run.maxMemory());
		System.out.println("1.TOTAL_MEMORY：" + run.totalMemory());
		System.out.println("1.FREE_MEMORY：" + run.freeMemory());
		String str = "" ;
		for (int x = 0; x < 30000; x++) {
			str += x ;  // 产生垃圾
		}
		System.out.println("2.MAX_MEMORY：" + run.maxMemory());
		System.out.println("2.TOTAL_MEMORY：" + run.totalMemory());
		System.out.println("2.FREE_MEMORY：" + run.freeMemory());
		run.gc() ;
		System.out.println("3.MAX_MEMORY：" + run.maxMemory());
		System.out.println("3.TOTAL_MEMORY：" + run.totalMemory());
		System.out.println("3.FREE_MEMORY：" + run.freeMemory());

	}
}
