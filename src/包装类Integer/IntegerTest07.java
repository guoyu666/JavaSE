package 包装类Integer;
/*

 */
public class IntegerTest07 {
    public static void main(String[] args) {
        //编译的时候没问题，一切符合java语法，运行时会不会出现问题呢？
        //不是一个“数字”可以包装成Integer吗？不能，运行时 出现异常！
        //Integer a  = new Integer("你好！");

        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String,返回int
        int retValue  = Integer.parseInt("124");
        System.out.println(retValue + 100);

        //valueOf方法作为了解
        //static Integer valueOf(int i)
        //静态的：int -- >  Integer

        //static Integer valueOf(String s)
        //静态的：String -- > Integer
    }
}
