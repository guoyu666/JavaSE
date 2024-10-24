package 异常;
/*
finally面试题
 */
public class ExceptionTest12 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result);
    }
    /*
    java语法规则（有一些语法规则不能被破坏，一旦这么说了，就必须这么做！）
        --java中有这么一条规则：方法体中的代码必须遵循自上而下的顺序依次执行（永恒不变的！！！）
        --java中return语句一旦执行 ，整个方法必须结束（永恒不变的！！！）
     */
    public static int m(){
        int i = 100;
        try {
            //这行代码出现在int i = 100；的下面，所以最终结果必须是返回100
            //return语句还必须保证是最后执行的，一旦执行，整个方法结束
            return i;
        }finally {
            i++;
        }
    }
}
