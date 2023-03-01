import java.util.Arrays;

public class StreamingTest {
    public static void main(String[] args) {
        Arrays.asList(6,4,6,7,8,7,8,6).stream()
                .filter(s -> s > 5)
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);
    }
}
