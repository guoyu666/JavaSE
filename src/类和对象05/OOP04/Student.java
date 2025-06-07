package 类和对象05.OOP04;

public class Student {
    String name;

    public void study() {
        // this本质上是一个引用，this中保存的也是对象的内存地址（保存的是当前对象的内存地址）
        // this.是可以省略的，默认访问的是当前对象的name
        System.out.println(this.name + "正在努力学习...");
        System.out.println(this.name + "正在努力学习呀...");
    }
}
