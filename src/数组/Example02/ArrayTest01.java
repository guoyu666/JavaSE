package 数组.Example02;
/*
关于java中的二维数组：
    1.二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {100,200,300};

        //二维数组
        int[][] a = {
                {1,2,3,4},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}
