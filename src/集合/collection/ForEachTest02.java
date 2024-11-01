package 集合.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        // 创建List集合
        List<String> strList = new ArrayList<>();

        // 添加元素
        strList.add("hello");
        strList.add("world!");
        strList.add("kitty!");

        // 遍历，使用迭代器方式
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        // 使用下标方式（只针对于有下标的集合）
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }

        // 使用foreach
        for(String s : strList){ // 因为泛型使用的是String类型，所以是：String s
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();     // 因为泛型使用的是Integer类型，所以是：Integer i
        list.add(100);
        list.add(200);
        list.add(300);
        for(Integer i : list){ // i代表集合中的元素
            System.out.println(i);
        }
    }
}
