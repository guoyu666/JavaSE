package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中对日期的处理
 */
public class DateTest01 {
    public static void main(String[] args) throws Exception {
        //获取系统当前时间（精确到毫秒的系统当前时间）
        Date nowTime  = new Date();

        //输出的应该不是一个对象的内存地址，应该是一个日期字符串（重写了toString方法）
        System.out.println(nowTime);

        //日期可以格式化吗？
        //SimpleDateFormat是java.text包下的，专门负责日期格式化
        /*
        yyyy    年
        MM      月
        dd      日
        HH      时
        mm      分
        ss      秒
        SSS     毫秒
        注意：在日期格式中，除了y  M d H m s S这些字符不能随便写之外，剩下的符号格式自己随意组织
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        //假设现在有一个日期字符串String，怎么转换成Date类型？
        String time = "2008-08-08 08:08:08 888";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同")
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);

        System.out.println(dateTime);


    }
}
