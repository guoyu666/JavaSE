package 异常;
/*
1.之前在讲解方法覆盖的时候，当时遗留了一个问题？
    --重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少！
2.总结异常中的关键字：
    --异常捕捉：try,catch,finally
    --throws在方法声明位置上使用，表示上报异常信息给调用者
    --throw手动抛出异常
 */
class Animal{
    public void doSome(){

    }

    public void doOther() throws Exception{

    }

}

class Cat extends Animal{
    //编译报错
    /*
    public void doSome() throws Exception{

    }
     */

    //编译正常
    /*
    public void doOther(){

    }
     */

    //编译正常
    public void doOther() throws NullPointerException{

    }

}
