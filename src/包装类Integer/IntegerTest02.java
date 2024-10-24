package 包装类Integer;
/*
8种基本数据类型对应的包装类型是什么？
    基本数据类型          包装类型
    ---------------------------
    byte                java.lang.Byte
    short               java.lang.Short
    int                 java.lang.Integer
    long                java.lang.Long
    float               java.lang.Float
    double              java.lang.Double
    boolean             java.lang.Boolean
    char                java.lang.Character
 */
public class IntegerTest02 {
    public static void main(String[] args)
    {
        //123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        //基本数据类型-（转换为）->引用数据类型（装箱）
        Integer i = new Integer(123);

        //将引用数据类型-（转换为）->基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f);

        int result = i.intValue();
        System.out.println(result);

    }
}
