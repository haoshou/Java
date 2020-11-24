package base.dataType;

/**
 * 字符型
 * <p>
 * 在Java之中使用单引好“'”定义的内容就表示一个字符，例如：'A'、'B'，那么定义字符的时候类型使用char完成。
 * 在各个语言之中，char和int之间是可以互相转换的，在C语言之中转换的编码是ASC II码，当时的编码范围：
 * · 大写字母范围：65 ~ 90；
 * · 小写字母范围：97 ~ 122。
 * 大写字母和小写字母之间差了32。
 */
public class TestChar {
    public static void main(String[] args) {
        char c = 'A';//定义一个字符
        int x = c;//char装int
        x += 32;//变成小写编码
        char temp = (char) x;//int转char
        System.out.println(temp);
    }
}
