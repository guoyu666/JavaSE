package 数组.ArraySearch;

/*
数组元素的查找：
        1.第一种方式：一个一个挨着找，直到找到为止
        2.第二种方式：二分法查找（算法），这个效率比较高
 */
public class ArraySearch {
    public static void main(String[] args) {
        //演示第一种方式
        int[] arr = {87, 45, 6, 7, 8};

        //需求：找出87的下标，如果没有返回-1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 87) {
                System.out.println("87元素的下标是：" + i);
            }
        }
        //程序执行到此处，表示没有87
        // System.out.println("87不存在该元素！");

        //采用调用方法的形式
        int index = arraySearch(arr, 8);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是：" + index);

    }

    public static int arraySearch(int[] arr, int ele) {
        for (int j = 0; j < arr.length; j++) {
            if (ele == arr[j]) {
                return j;
            }
        }
        return -1;
    }
}
