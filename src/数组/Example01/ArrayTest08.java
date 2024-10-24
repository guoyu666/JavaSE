package 数组.Example01;

/*
关于一维数组的扩容：
    在java开发中，数组长度一旦确定不可变，那么数组满了怎么办？
    -->数组满了，需要扩容。java中对数组的扩容是：先新建一个大容量的数组，然后将小容量中的数据一个一个拷贝到大数据当中

结论：数组扩容效率较低，因为涉及到拷贝的问题，所以以后在开发中请注意：尽可能少的进行数组的拷贝，可以在创建数组对象的时候预先估计多长合适，这样可以减少数组的扩容次数，提高效率
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        //拷贝源
        int[] src = {1, 11, 22, 3, 4};

        //拷贝目标
        int[] dest = new int[10];
        System.arraycopy(src, 1, dest, 3, 2);

        //遍历目标数组
        for (int result : dest) {
            System.out.println(result);
        }

        //数组中如果存储的元素是引用，可以拷贝吗？当然可以
        String[] strs = {"hello", "world", "study", "java", "oracle", "jdbc"};
        String[] newStrs = new String[20];
        System.arraycopy(strs, 0, newStrs, 0, strs.length);

        for (String s : newStrs) {
            System.out.println(s);
        }

    }

}
