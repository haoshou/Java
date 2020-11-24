package collection;
/**
 * Collections是一个工具类，可以操作任意集合对象
 */

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "a", "b", "c");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
