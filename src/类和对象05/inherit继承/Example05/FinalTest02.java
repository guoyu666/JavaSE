package 类和对象05.inherit继承.Example05;

public class FinalTest02 {
    public static void main(String[] args)
    {
        Person p1 = new Person(20);
        System.out.println(p1.age);

        final Person p = new Person(30);
        System.out.println(p.age);

        p.age = 40;
        System.out.println(p.age);

        //p = new Person(35);     final修饰的变量只能赋一次值，这里会报错

        /*
        final修饰的引用：
            该引用只能指向一个对象，并且它只能 永远指向该对象，无法再指向其他对象
            并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收

            虽然final的引用指向对象A后不能再重新指向对象B，但是对象A内部的数据可以修改！！
         */
    }
}

class Person
{
    int age;

    public Person()
    {

    }

    public Person(int age)
    {
        this.age  =  age;
    }
}
