package 异常;

public class ExceptionTest14 {
    public static void main(String[] args) {
        //创建异常对象（只new了异常对象，并没有手动抛出去）
        MyException e = new MyException("用户名不能为空 ！");

        //打印异常堆栈消息
        e.printStackTrace();

        //获取异常简单描述信息
        String msg = e.getMessage();
        System.out.println(msg);
    }
}
