package 数组.ArraySearch;

/*
1.二分法查找算法是基于排序的基础之上（没有排序的数据是无法查找的！！）
2.二分法查找效率要高于一个挨着一个的查找方式
 */
public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {122, 200, 230, 235, 1000, 2000};

        //找出arr这个数组中200元素所在的下标
        //调用方法
        int index = binarySearch(arr, 200);
        System.out.println(index == -1 ? "该元素不存在" : "该元素存在，下标为：" + index);
    }

    //-1表示该元素不存在，其他表示返回该元素的下标
    public static int binarySearch(int[] arr, int dest) {
        //开始下标
        int begin = 0;
        //结束下标
        int end = arr.length - 1;
        while (begin <= end) {
            //中间下标
            int mid = (begin + end) / 2;
            if (arr[mid] == dest)
                return mid;
            else if (arr[mid] < dest) {
                //目标在“中间：的右边
                //开始元素下标要发生变化
                begin = mid + 1;
            } else {
                //arr[mid] > dest
                //目标在“中间”的左边
                end = mid - 1;
            }
        }
        return -1;
    }
}
