package 变量;

/**
 * 变量测试类2
 * @author 杜聚宾
 * @version 1.5
 * @since 1.0
 */
/*
	什么是变量？
		变量其实就是内存当中存储数据的最基本的单元。
		变量就是一个存储数据的盒子。

	在java语言当中任何数据都是有数据类型的，其中整数型是：int
		没有为什么，java中规定的，整数型就是：int
	
	当然，在java中除了数据类型int之外，还有其它的类型，例如带小数的：double等。。。

	数据类型有什么用呢？
		记住：不同的数据类型，在内存中分配的空间大小不同。
		也就是说，Java虚拟机到底给这个数据分配多大的空间，主要还是看这个变量的数据类型。
		根据不同的类型，分配不同大小的空间。
	
	对于int这种整数类型，JVM会自动给int分配4个字节大小的空间。

	1个字节=8个比特位
	1个比特位就是一个1或0. 注意：比特位是二进制位。
	int是占用多少个二进制位？1个int占有32个二进制位（bit位）

	int i = 1; 实际上在内存中是这样表示的：
		00000000 00000000 00000000 00000001
	int i = 2;
		00000000 00000000 00000000 00000010
	
	二进制位就是：满2进1位（0 1 10 11 100 101....）
	十进制位就是：满10进1位（1 2 3 4 5 6 7 8 9 10）

	对于一个变量来说，包括三要素：
		变量的数据类型
		变量的名字
		变量中保存的值

		类型+名字+值
			类型决定空间的大小。
			起个名字是为了以后方便访问。（以后在程序中访问这个数据是通过名称来访问的。）
			值是变量保存的数据。

	变量名属于标识符吗？
		变量名命名规范中是怎么说的？
			首字母小写，后面每个单词首字母大写，遵循驼峰命名方式，见名知意。
	
	变量怎么声明/定义，语法格式是什么？
		数据类型 变量名;
		例如：
			int nianLing;
	
	在java语言中有一个规定，变量必须先声明，再赋值才能访问。（没有值相当于这个空间没有开辟。）

	在java语言中怎么给一个变量赋值呢，语法格式是什么？
		记住：使用一个运算符，叫做“=”，这个运算符被称为赋值运算符。
		赋值运算符“=”的运算特点是：等号右边先执行，执行完之后赋值给左边的变量。
	
	变量可以声明的时候赋值吗？可以的。
	
*/
public class VarTest02{

    /**
     * 这是一个程序的入口
     * args是main方法的参数
     */
    public static void main(String[] args){

        // 定义一个int类型的变量，起名nianLing，该变量用来存储人的年龄。
        int nianLing;

        // 变量声明之后，没有手动赋值，可以直接访问吗？
        // 编译报错：错误: 可能尚未初始化变量nianLing
        //System.out.println(nianLing);

        // 给变量赋值
        nianLing = 45;
        System.out.println(nianLing); // 这是访问变量。

        System.out.println("nianLing"); // 这是访问字符串。

        // 变量：可以变化的量。
        // 重新赋值
        nianLing = 80;
        System.out.println(nianLing);

        // 再次重新赋值
        nianLing = 90;
        System.out.println(nianLing);

        // 体重80kg
        int tiZhong = 80;
        System.out.println(tiZhong);
    }
}