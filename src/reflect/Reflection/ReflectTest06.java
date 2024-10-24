package reflect.Reflection;
//通过反射机制，反编译一个类的属性Field（了解一下）

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest06 {
    public static void main(String[] args) throws Exception{

        // 创建这个是为了拼接字符串。
        StringBuilder s = new StringBuilder();

        Class studentClass = Class.forName("reflect.bean.Student");

        s.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + " {\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));  //类中变量的属性
            s.append(" ");
            s.append(field.getType().getSimpleName());          //类中变量的类型
            s.append(" ");
            s.append(field.getName());                          //类中变量的名字
            s.append(";\n");
        }
        s.append("}");
        System.out.println(s);


    }
}
