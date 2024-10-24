package IO流.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader：
    文件字符输入流，只能读取普通文本。
    读取文本内容时，比较方便，快捷。
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // 创建文件字符输入流
            reader = new FileReader("/Users/apple/Documents/temp01.txt");

            //准备一个char数组
            char[] chars1 = new char[4];
            // 往char数组中读
            reader.read(chars1); // 按照字符的方式读取：第一次a，第二次b，第三次c....
            for(char c : chars1) {
                System.out.println(c);
            }
            System.out.println("-----------------");

            //开始读
            char[] chars2 = new char[4]; // 一次读取4个字符
            int readCount = 0;
            while((readCount = reader.read(chars2)) != -1) {
                System.out.print(new String(chars2,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
