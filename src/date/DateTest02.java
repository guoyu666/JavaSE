package date;
/*
获取自1970年1月1日00:00:00 000到当前系统时间的总毫秒数

简单总结一下System类的相关属性和方法：
    System.out  [out是System类的静态变量]
    System.out.println()        [println方法不是System类的，是PrintStream类的方法]
    System.gc()                 [建议启动垃圾回收器]
    System.currentTimeMillis()  [获取自1970年1月1日到系统当前时间的总毫秒数字]
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);

        //统计一个方法耗时
        //在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();

        //在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();

        System.out.println("耗费时长" + (end - begin) + "毫秒");

    }

    //需求：统计一个方法执行所耗费时长
    public static void print(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);
        }
    }
}
