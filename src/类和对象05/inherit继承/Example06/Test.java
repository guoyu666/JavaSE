package 类和对象05.inherit继承.Example06;

import java.util.Date;

/**
 *1. import语句用来完成导入其他类，同一个包下的类不需要导入，不再同一个包下需要手动导入
 *2. import语法格式：
 *      1.import 类名
 *      2.import 包名.*
 *3. java.lang.*不需要手动引入，系统自动引入。lang:language语言包，是java语言的核心类，不需要手动引入
 *4. 最终结论：什么时候需要import：不是java.lang包下，并且不在同一个包下的时候，需要使用import进行引入
 *
 */
public class Test {
    Date d = new Date();
}
