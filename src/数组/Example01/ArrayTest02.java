package 数组.Example01;
/*
当你创建数组的时候，确定数组中存储中存储那些具体元素的时候，采用静态初始化的方法；
当你创建数组的时候，不确定将来数组中存储那些数据的时候，可以采用动态初始化的方法；
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];

        //遍历数组
        for (int j : a) {
            System.out.println(j);
        }

        //初始化一个Object类型的数组，采用动态初始化的方式
        Object[] obj = new Object[3];
        for (Object object : obj) {
            System.out.println(object);
        }

        //采用静态初始化饿方法
        String[] str = {"abc", "def", "xyz"};
        for (String s : str) {
            System.out.println(s);
        }

        //存储Object，采用静态初始化呢？
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1, o2, o3};
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
