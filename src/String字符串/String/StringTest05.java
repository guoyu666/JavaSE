package String字符串.String;

import java.util.Arrays;

public class StringTest05 {
    public static void main(String[] args) {
        //String类当中常用的方法
        //1.char charAt(int index)
        char c = "中国人".charAt(1);
        System.out.println(c);

        //2.（了解）int compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);             //前后一致 10-10 = 0

        int result2 = "abcd".compareTo("abce"); //前小后大 8 - 9 = -1
        System.out.println(result2);

        int result3 = "abce".compareTo("abcd"); //前大后小 9 - 8 = 1
        System.out.println(result3);

        //3.（掌握）boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的子字符串
        System.out.println("Hello world.java".contains(".java"));

        //4.(掌握) boolean endsWith(String suffix)
        //判断当前字符串是否已某个字符串结尾
        System.out.println("test.txt".endsWith("xt"));

        //5.（掌握）boolean equals(Object anObject)
        //比较两个字符串必须使用equals方法，不能使用“==”
        //equals方法有没有调用compareTo方法？新的版本没有调用
        System.out.println("abc".equals("abc"));

        //6.(掌握)boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("Abc".equalsIgnoreCase("abc"));

        //7.(掌握)byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        System.out.println(Arrays.toString(bytes));

        //8.(掌握)int indexOf(String str)
        //判断某个子字符串在当前字符串中第一次出现的索引
        System.out.println("oraclejavapython".indexOf("java"));

        //9.(掌握)boolean isEmpty()
        //判断某个字符串是否为空
        String s = "";
        System.out.println(s.isEmpty());

        //10.(掌握)int length()
        //面试题：判断数组长度是length属性，判断字符串长度是length（）方法
        System.out.println("abc".length());

        //11.(掌握)int lastIndexOf(String str)
        //判断某个字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavapythonc#javaC++".lastIndexOf("java"));

        //12.(掌握)String  replace(CharSequence  target, CharSequence replacement)
        //String类的父接口就是CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);

        //13.(掌握)String[] split(String regex)
        //拆分字符串
        String[] ymd = "1998-10-1".split("-");
        for (String S : ymd){
            System.out.println(S);
        }

        //14.(掌握)String substring(int beginIndex)参数是起始下标
        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));

        //15.(掌握)String substring(int beginIndex, int  endIndex)
        //beginIndex是起始位置（包括），endIndex结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));

        //16.（掌握）String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将“非字符串“转换成”字符串“
        String s1 = String.valueOf(true);
        System.out.println(s1);

        //这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString（）方法吗？
        String s2 = String.valueOf(new Customer());
        //System.out.println(s2);     没有重写toString()方法之前是对象的内存地址

        System.out.println(s2);       //显示我是一个VIP客户！

        Object obj = new Object();
        //通过源代码可以看出，为什么输出一个引用的时候，会调用toString（）方法！！！
        //本质上System.out.println()这个方法在输出任何数据的时候都是转换成字符串，再输出
        System.out.println(obj);


    }
}

class Customer{
    public String toString(){
        return "我是一个VIP客户！";
    }
}
