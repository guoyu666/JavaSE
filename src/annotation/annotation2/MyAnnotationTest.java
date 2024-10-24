package annotation.annotation2;

public class MyAnnotationTest {
    //报错原因：如果一个注解当中有属性，那么必须给属性赋值（除非该属性使用default指定了默认值）
    /*
    @MyAnnotation
    public void doSome()
     */

    //@MyAnnotation(属性名=属性值,属性名=属性值)
    @MyAnnotation(name = "guoyu", color = "red")
    public void doSome(){
    }
}
