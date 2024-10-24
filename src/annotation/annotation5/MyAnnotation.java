package annotation.annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//只允许该注解可以标注类，方法
@Target(value = {ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
//希望这个注解可以被反射
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "北京大兴区";
}
