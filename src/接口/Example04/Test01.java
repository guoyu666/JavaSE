package 接口.Example04;

/**
 * 1.总结：String类已经重写了equals方法，比较两个字符串不能直接使用==，必须使用equals，equals是通用的
 * 2.总结：java中所有的基本数据类型比较是否相等使用==；java中所有的引用数据类型使用equals判断是否相等；
 *
 *
 */
public class Test01 {
    public static void main(String[] args){
        //大部份情况下，采用这样的方式 创建字符串对象
        String s1 = "hello";
        String s2 = "abc";

        //实际上String也是一个类，不属于基本数据类型
        //既然String是一个类，那么一定存在构造方法
        String s3 = new String("Test1");
        String s4 = new String("Test1");

        //new两次，两个对象的内存地址肯定不一样，用==判断的是内存地址，不是内容
        System.out.println(s3 == s4);

        //比较两个字符串能不能使用双等号？--不能必须调用equals方法，但是String已经重写了equals方法
        System.out.println(s3.equals(s4));

        //String类有没有重写toString方法呢？
        String x = new String("动力节点");
        //如果String没有重写toString（）方法，输出结果：java.lang.String@十六进制的地址
        System.out.println(x.toString());
        System.out.println(x);          //输出引用的时候，会自动调用toString方法
    }
}
