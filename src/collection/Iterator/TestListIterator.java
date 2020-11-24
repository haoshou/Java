package collection.Iterator;
/**
 * Iterator可以完成的是由前向后的单向输出操作，
 * 如果现在希望可以完成由前向后，和由后向前输出的话，那么就可以利用ListIterator接口完成
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            System.out.println(s);
        }
        while (listIterator.hasPrevious()) {
            String s = listIterator.previous();
            System.out.println(s);
        }
    }
}
