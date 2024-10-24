package 数组.Example01;

public class ArrayTest05 {
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象的长度？默认为0
        //通过测试得出：args不是null
        System.out.println("JVM给传递过来的String数组参数，它的这个数组的长度是？" + args.length);

        //这个数组什么时候里面会有值呢？
        //其实这个数组是留给用户的，用户可以在控制台上输入参数 ，这个参数会被转换成“String[] args”
        //例如这样运行程序：java ArrayTest05 abc def xyz
        //那么这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成后，自动放到“String[] args”数组中
        //所以main方法上面的String[] args数组主要是用来接受用户输入参数的
        //把abc def xyz转换成字符串数组：{"abc","def","xyz"}

    }

    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
