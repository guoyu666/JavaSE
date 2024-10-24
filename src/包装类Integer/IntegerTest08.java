package 包装类Integer;
/*
String int Integer之间相互转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //String -- > int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);  //i1是100的数字
        System.out.println(i1 + 1);

        //int -- > String
        String s2 = i1 + "";    //"100"字符串
        System.out.println(s2 + 1);

        //int -- > Integer
        //自动装箱
        Integer x = 100;

        //Integer -- > int
        int y = x;

        //String -- > Integer
        Integer k = Integer.valueOf("123");

        //Integer -- > String
        String s = String.valueOf(k);
    }
}
