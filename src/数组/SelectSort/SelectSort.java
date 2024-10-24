package 数组.SelectSort;
/*
选择排序：循环一次，然后找出参加比较的这堆数据最小的，拿着这个最小的值和最前面的的数据交换位置
训责排序比冒泡排序好在：每一次的交换位置都是有意义的
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 54, 34};
        int count1 = 0;  //记录比较次数
        int count2 = 0;  //记录交换次数
        //选择排序
        //5条数据循环4次（外层循环4次）
        for (int i = 0; i < arr.length; i++) {
            //i的值是0，1，2，3
            //i正好是“参加比较的这堆数据中”最左边那个元素的下标
            //假设起点i下标位置上的元素是最小的
            int min = i;
            for (int j = i+1; j <arr.length; j++) {
                count1++;
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            //当i和min相等时，表示最初猜测是对的
            //当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素
            //需要拿着这个更小的元素和最左边的元素交换位置
            if (min != i){
                //表示存在更小的数据
                //arr[min]此时是最小的数据
                //arr[i]是最前面的数据
                int temp =  arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                count2++;
            }
        }
        //排序完成之后遍历
        for(int result : arr){
            System.out.println(result);
        }

        //冒泡排序和选择排序实际上比较的次数没变
        //交换位置的次数减少了
        System.out.println("总共比较了：" + count1);
        System.out.println("总共交换了多少次：" +  count2);

    }
}
