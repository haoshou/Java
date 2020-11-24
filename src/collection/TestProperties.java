package collection;

import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name:", "小明");
        properties.setProperty("realname:", "小红");
        System.out.println(properties.getProperty("name:"));
        System.out.println(properties.getProperty("1:", "没有发现"));

    }
}
