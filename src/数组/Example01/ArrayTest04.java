package 数组.Example01;

public class ArrayTest04 {
    public static void main(String[] args) {
        //如果直接传递一个静态数组的话，语法必须这样写
        printArray(new int[] {1,2,3});
    }

    //为什么要使用静态方法？不需要new对象
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.println(j);
        }
    }
}
