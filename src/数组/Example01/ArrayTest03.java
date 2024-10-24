package 数组.Example01;

public class ArrayTest03 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        printArray(x);

        String[] s = {"123", "345","456"};
        printArray(s);
    }
    public static void printArray(int[] array){
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static void printArray(String[] args){
        for (String s  : args){
            System.out.println(s);
        }
    }
}


