package 异常;

//finally语句
public class ExceptionTest10 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗？可以
        try不能单独使用，try finally可以联合使用
        以下代码的执行顺序：
            --先执行try
            --再执行finally
            --最后执行return （return语句只要执行方法必然结束）
         */
        try {
            System.out.println("try...");
            return;
        } finally {
            System.out.println("finally");
        }

        //System.out.println("hello"); 这个语句根本无法执行到这里
    }
}
