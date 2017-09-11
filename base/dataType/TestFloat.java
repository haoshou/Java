package base.dataType;

/**
 * 浮点型指的是小数，在java之中，默认的一个小数实际上对应的类型就是double型数据。
 */
public class TestFloat {
	public static void main(String[] args) {
		double x = 10.02;
		System.out.println(x*x);//100.40039999999999
		/**
		 *  这个时候的计算结果为：“ 100.40039999999999” 。
		 *  按照数学的角度，肯定结果不正确，但是这个结果是由于JVM本身的bug所决定。
		 */

		testFloat();


	}

	public static void testFloat() {
		/**
		 * 而在浮点型数据之中，实际上也分为两种：double、float，
			float的范围要小于double的范围，那么既然默认的小数属于double型数据，如果要为float赋值呢？
			必须强制转换，而转换的方式：数字F、(float)数字；
		 */
		float f = 10.02F;//double转float
		float y = (float)10.02;//double转float
	}

	/**
	 * · 自动转型（由小到大）：byte  short  int  long  float  double；
	   · 强制转型（由大到小）：double  float  long  int  short  byte。

	 */
}
