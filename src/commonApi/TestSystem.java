package commonApi;

public class TestSystem {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int x = 0; x < 30000; x++) {
            str += x; // 产生垃圾
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间：" + (end - start));
        /**
         *   在日后的许多开发之中，都会出现自动统计操作时间的功能，出现之后应该可以立刻清楚是通过System.currentTimeMilllis()方法完成的。
         */

    }
}
