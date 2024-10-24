package annotation.annotation4;

//如果数组中只有一个元素，大括号可以省略
@OtherAnnotation(age = 25, email = {"zhangsan123@.com", "guoyu@123.com"}, seasonArray = {Season.SPRING, Season.SUMMER})
public class OtherAnnotationTest {
    public void doSome(){

    }
}
