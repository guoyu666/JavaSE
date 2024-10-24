package 接口.Example04;

/**
 * 1.equals的源代码：
 * public boolean equals(Object obj){
 * return (this==obj)  --  默认采用的是“==”判断两个Java对象是否相等，而“==”判断的是两个Java对象的内存地址，我们应该判断两个java对象的内容是否相等，所以此方法实际中不够用，需要重写
 * }
 * 2.设计目的？--以后编程当中，都要通过equals方法来判断两个对象是否相等
 * 3.判断两个java对象是否相等不能使用“==”，因为“==”比较的是两个对象的内存地址
 */
public class equals {
    public static void main(String[] args) {
        //判断两个基本数据类型是否相等可以使用“==”就行
        int a = 100;
        int b = 100;

        //这里的“==”判断的是a中保存的100和b中保存的100是否相等
        System.out.println(a == b);

        //判断两个Java对象是否相等，能直接使用“==”吗？  -- 不能
        Mytime1 t1 = new Mytime1(2008, 1, 1);
        Mytime1 t2 = new Mytime1(2008, 1, 1);

        //这里的“==”判断的是t1的地址和t2的地址是否相等，这里肯定两个不相等！！
        System.out.println(t1 == t2);
        //重写equals方法后
        System.out.println(t1.equals(t2));
    }
}

class Mytime1 {
    int year;
    int month;
    int day;

    public Mytime1() {

    }

    public Mytime1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写equals方法
    public boolean equals(Object obj) {
        if (obj == null)                     //如果obj是空，直接返回false
            return false;
        if (!(obj instanceof Mytime1 t))      //如果obj不是一个Mytime1，没必要比较了，直接返回false
            return false;
        if (this == obj)                    //如果this和obj保存的内存地址相同，没必要比较了，直接返回true
            return true;

        //程序能够运行到这说明了什么？--说明obj不是null,obj是Mytime1类型
        return (this.year == t.year) && (this.month == t.month) && (this.day == t.day);
    }
}
