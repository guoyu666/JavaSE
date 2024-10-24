package IO流.IO;

import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:
    文件字符输出流，写
    只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            //创建文件输出流对象,true表示不清空之前的文件
            out = new FileWriter("/Users/apple/Documents/temp02.txt", true);

            //开始写
            char[] chars = {'我', '是', '中', '国', '人'};
            out.write(chars);
            out.write(chars, 2, 3);


            //刷新
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
