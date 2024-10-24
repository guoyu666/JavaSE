package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
关于try..catch中的finally子句：
1.在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
2.finally语句通常使用在那些情况下呢？
    --通常在finally语句块中完成资源的释放/关闭
    --因为finally中的代码比较有保障
    --即使try语句块中的代码异常，finally中代码也会正常执行

 */
public class ExceptionTest09 {
    public static void main(String[] args) {
        FileInputStream fis = null; //声明位置放到try外边，这样在finally中才能用
        try {
            //创建输入流对象
            fis = new FileInputStream("/Users/apple/Documents/ideaProjects/JavaSE/src/异常/ExceptionTest01.java");

            String s = null;
            //这里一定会出现空指针异常！
            s.toString();

            System.out.println("Hello world!");

            //流使用完需要关闭，因为流是占用资源的
            //即使以上程序出现异常，流也必须要关闭，放在这里有可能流关闭不了
            //fis.close();
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Hello浩克");
            //流的关闭放在这里比较保险，finally中的代码是一定会执行的，即使try中出现了异常！
            if (fis != null) {
                try {
                    //close()方法有异常，采用捕捉的方式
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Hello Kitty!");
    }
}
