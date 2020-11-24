package commonApi;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.round(15.5)); // 16
        System.out.println(Math.round(15.51)); // 16
        System.out.println(Math.round(15.6)); // 16
        System.out.println(Math.round(15.2356)); // 15
        System.out.println(Math.round(-15.5)); // -15
        System.out.println(Math.round(-15.51)); // -16
        System.out.println(Math.round(-15.6)); // -16

    }
}
