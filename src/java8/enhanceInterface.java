package java8;

/**
 * Java8新特性：接口定义增强
 * 接口中加default的方法，可以使实现接口的子类调用方法
 * 接口中加static的方法，可以直接使用接口调用方法
 */
interface IMessage {
    void print();

    default void fun() {
        System.out.println("default");
    }

    static void test() {
        System.out.println("test");
    }

}

class Message implements IMessage {

    @Override
    public void print() {
        System.out.println("Hello");
    }
}

public class enhanceInterface {
    public static void main(String[] args) {
        Message message = new Message();
        message.print();
        message.fun();

        IMessage.test();
    }
}
