package Enum;

public class EnumTest01 {
    public static void main(String[] args) {
        boolean result = Divide(10,2);
        System.out.println(result ? "计算成功！" : "计算失败！");
    }


    //以下程序计算两个int类型的数据，计算成功返回1，计算失败返回0
    //这个设计有缺陷，问题在于方法的返回值类型上，返回一个int不恰当，既然最后的结果只是成功和失败，最好使用布尔类型，因为布尔类型true和false正好表示不同的状态
    public static int divide(int a, int b) {
        try {
            int c = a / b;
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    //这种设计不错
    public static boolean Divide(int a, int b) {
        try {
            int c = a / b;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //以上的这个方法设计没毛病，返回true和false表示两种情况，但是在以后的开发中，有可能遇到一个方法执行结果包含多种情况，这时这个布尔类型就不适了
}
