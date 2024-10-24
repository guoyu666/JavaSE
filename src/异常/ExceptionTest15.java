package 异常;
/*
测试改良之后的MyStack
 */
public class ExceptionTest15 {
    public static void main(String[] args) {
        //创建栈对象
        MyStack stack = new MyStack();

        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            //这里栈满了
            stack.push(new Object());
        } catch (MyStackOperationException e) {
            //输出异常的简单信息
            System.out.println(e);
        }
    }
}
