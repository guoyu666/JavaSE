package 类和对象05.Example05;

public class Test01 {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.num = 10;
        s.name = "GuoYu";

        Student lisi = new Student();
        lisi.name = "李四";
        lisi.num = 20;

        System.out.println(lisi.name);


    }
}
