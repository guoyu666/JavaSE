package Enum;
//采用枚举的方式

//枚举是一种引用数据类型，结果只有两种情况的，建议使用布尔类型，结果超过两种并且还是可以一枚一枚列举出来的，建议使用布尔类型
public class EnumTest02 {
    public static void main(String[] args) {
        Result r = Divide(10,2);
        System.out.println(r == Result.Success? "计算成功" : "计算失败");
    }

    public static Result Divide(int a, int b) {
        try {
            int c = a / b;
            return Result.Success;
        } catch (Exception e) {
            return Result.Fail;
        }
    }
}

//枚举：一枚一枚可以列举出来，才建议使用枚举类型
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型
//枚举中的每一个值可以看做是常量
enum Result {
    //Success是枚举Result类型中的一个值
    //Fail是枚举类型中的另一个值
    Success,Fail
}