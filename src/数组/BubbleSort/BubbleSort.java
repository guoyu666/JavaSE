package 数组.BubbleSort;

/*
冒泡排序算法!!
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 54, 34};
        int count1 = 0;  //记录比较次数
        int count2 = 0;  //记录交换次数

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                count1++;
                if (arr[j] > arr[j + 1]) {
                    int exchange = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = exchange;
                    count2++;
                }
            }
        }
        System.out.println("总共比较了多少次：" + count1);
        System.out.println("总共交换了多少次：" +  count2);

        for (int result : arr) {    //排序完输出结果
            System.out.println(result);
        }
    }

}
