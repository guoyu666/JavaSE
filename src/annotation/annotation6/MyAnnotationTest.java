package annotation.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest {

    @MyAnnotation(username = "GuoYu", password = "456456")
    public void doSome(){
    }

    public static void main(String[] args) throws Exception{
        // 获取MyAnnotationTest的doSome()方法上面的注解信息。
        Class<?> c = Class.forName("annotation.annotation6.MyAnnotationTest");
        // 获取doSome()方法
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        // 判断该方法上是否存在这个注解
        if(doSomeMethod.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = doSomeMethod.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.username());
            System.out.println(myAnnotation.password());
        }
    }
}
