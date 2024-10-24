package random;

import java.util.Arrays;
import java.util.Random;

/*
编写程序：生成5个不重复的随机数[0-100]，重复的话重新生成
最终生成的5个随机数放到数组中，要求数组中的这5个随机数不重复
 */
public class RandomTest02 {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();

        //准备一个长度为5的一维数组
        int[] arr = new int[5];
        Arrays.fill(arr, -1);   //将数组中的每个元素先初始化为-1

        //循环，生成随机数
        int index = 0;
        while (index < arr.length) {
            //生成随机数
            int num = random.nextInt(101);
            //判断arr数组中有没有这个num
            //如果没有这个num,就放进去
            if (!contains(arr, num)) {
                arr[index] = num;
                index++;
            }
        }

        for (int res : arr) {
            System.out.println(res);
        }
    }

    //单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
    //true表示包含，false表示不包含
    public static boolean contains(int[] arr, int key) {
        for (int j : arr) {
            if (j == key) return true;
        }
        return false;
    }

}
