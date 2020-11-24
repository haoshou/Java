package base.dataType;

/**
 * 整型就表示一个基本的整数，可以直接使用int定义，而且在Java之中默认的一个整数，其类型就是int
 */
public class TestInt {
    public static void main(String[] args) {
        int x = 10; // 10是一个整数，就属于int型
        int result = x * 2; // int型 * int型 = int型
        System.out.println(result);

        LimitOperate();


    }

    //极限操作
    public static void LimitOperate() {
        /**
         *  int型数据本身也是有自己的保存范围的，那么如果说现在操作的数据已经超过了其int的范围呢？
         可以通过它得出int的最大值和最小值：
         · 取得int的最大值：Integer.MAX_VALUE；
         · 取得int的最小值：Integer.MIN_VALUE。
         */
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue);//2147483647
        System.out.println(minValue);//-2147483648

        // 最大值 + 1 = 最小值、最小值 - 1 = 最大值
        System.out.println(maxValue + 1);         // int型 + int型 = int型，-2147483648
        System.out.println(maxValue + 2);         // int型 + int型 = int型，-2147483647
        System.out.println(minValue - 1);       // int型 - int型 = int型，2147483647
    }
}
