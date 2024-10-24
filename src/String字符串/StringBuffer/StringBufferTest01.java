package String字符串.StringBuffer;
/*
1.思考：我们在实际的开发中，如果需要进行字符串的频繁拼接，会有什么问题？
    --因为java中的字符串是不可变的，每一次拼接都会产生新的字符串
    这样会占用大量方法区的内存，造成内存空间的浪费
    String s = "abc"
    s += "hello"
    就以上两行代码，就导致在方法区字符串常量池当中创建了3个对象：
        “abc”
        "hello"
        "abchello"

2.如何优化StringBuffer的性能？
    --在创建StringBuffer的时候尽可能 给定一个初始化的容量，最好减少底层数组的扩容次数，预估计一个，给一个大一些的容量
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        //创建一个初始化容量为16个字符的byte[]的数组（字符串缓冲区对象）
        StringBuffer stringBuffer  = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append方法
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        //append方法底层在进行追加的时候，如果byte数组满了，会自动扩容
        stringBuffer.append(3.14);

        System.out.println(stringBuffer);

        //指定初始化容量的StringBuffer()对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);
        sb.append("guoyu");
        sb.append("你好");

        System.out.println(sb);
    }
}
