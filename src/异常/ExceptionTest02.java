package 异常;
/*
1.异常在java语言中以类的形式存在，每一个异常类都可以创建异常对象

2.类是：模版
  对象是：异常类
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
       NumberFormatException nfe = new NumberFormatException("数字格式化异常");
       System.out.println(nfe);
    }
}
