package collection;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合，使用java.util.Arrays的asList函数
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[1] = "111";
        List<String> strings = Arrays.asList(arr);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
