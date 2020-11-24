package commonApi;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 大数字操作类
 * java.math.BigInteger、java.math.BigDecimal，而这两个类是属于Number的子类。
 */
public class TestBigOperate {
    public static void main(String[] args) {
//		testBigInteger();

        System.out.println(round(15.5, 0)); // 16
        System.out.println(round(-15.5, 0)); // -15
        System.out.println(round(168.98765, 2)); // 168.99

    }

    private static void testBigInteger() {
        BigInteger bigA = new BigInteger("234809234801");
        BigInteger bigB = new BigInteger("8939834789");
        System.out.println("加法结果：" + bigA.add(bigB));
        System.out.println("减法结果：" + bigA.subtract(bigB));
        System.out.println("乘法结果：" + bigA.multiply(bigB));
        System.out.println("除法结果：" + bigA.divide(bigB));
        BigInteger result[] = bigA.divideAndRemainder(bigB);
        System.out.println("商：" + result[0] + "，余数：" + result[1]);
    }

    public static double round(double num, int scale) {
        BigDecimal big = new BigDecimal(num);
        BigDecimal result = big.divide(new BigDecimal(1), scale,
                BigDecimal.ROUND_HALF_UP);
        return result.doubleValue(); // Number类的方法
    }

}
