package 数组.Example02;

import java.util.Arrays;

public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = {112,3,4,56,67,1};

        //调用数组工具类进行快速排序
        Arrays.sort(arr);

        for (int i : arr){
            System.out.println(i);
        }
    }
}
