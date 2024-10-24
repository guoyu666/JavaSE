package 异常;
/*
1.java的异常处理机制
    --1.1-异常在java中以类和对象的形式存在，那么异常的继承结构是怎样的呢？
    我们可以使用UML图来描述一下继承结构，画UML图有很多工具，例如：rational rose, starUML等...

    --1.2-UML图是一种统一的建模语言，一种图标式语言（画图的），在UML图中可以描述类和类之间的关系，程序执行的流程，对象的状态等...

    --1.3-编译时异常和运行时异常，都发生在运阶段。编译阶段异常是不会发生的。编译时异常因为什么而的名的？
        --因为编译时异常必须在编译（编写）阶段预先处理，如果不处理编译器报错，因此的名，因为异常的发生就是new异常对象。

    --1.4-编译时异常一般发生的概率比较高，运行时异常一般发生的概率比较低，假如java中没有对异常进行划分，没有分为：编译时异常和运行时异常，所有的异常
    都需要在编写程序阶段对其进行预处理，将是怎样的效果呢？--首先，如果是这样的话，程序肯定是绝对安全的，但是 程序员编写程序太累，代码到处都是处理异常的代码。

    --1.5-所有异常都是发生在运行阶段的

2.思考：异常发生之后，如果我选择了上抛，抛给了我的调用者，调用者需要对这个异常继续处理，那么调用者处理这个异常
同样有两种处理方式。

3.注意：java中异常发生之后如果一直上抛，最终抛给了main方法，main方法继续向上抛，抛给了调用者JVM，JVM知道了
这个异常，只有一个结果，终止java程序的执行
 */
public class ExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(10 / 0);
        /*
        程序执行到此发生了异常，然后抛出，抛给了main方法，main方法没有处理，将这个异常自动抛给了JVM,JVM最终终止程序的执行
         */
        System.out.println("hello world");
    }
}
