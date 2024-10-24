package String字符串.StringBuilder;
/*
StringBuffer与StringBuilder的区别？
    --StringBuffer中的方法都有synchronized关键字修饰，表示StringBuffer在多线程环境下运行是安全的
    --StringBuilder中的方法都没有synchronized关键字修饰，表示StringBuilder在多线程环境下运行是不安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //使用StringBuilder也是可以完成字符串的拼接
        sb.append("guoyu");
        sb.append("123");
        System.out.println(sb);
    }
}
