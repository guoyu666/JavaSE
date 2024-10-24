package 数组.ArraySearch;

import java.util.Arrays;

/*
好消息：SUN公司已经为我们程序员写好了一个数组工具类：java.util.Arrays
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,12,56,78,56};

        Arrays.sort(arr);

        for (int result : arr){
            System.out.println(result);
        }

        int index = Arrays.binarySearch(arr, 78);
        System.out.println(index == 1 ? "该元素不存在" : "该元素下标是：" + index);


    }
}
