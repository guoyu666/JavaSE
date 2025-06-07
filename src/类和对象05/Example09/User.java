package 类和对象05.Example09;

/**
 * "this."什么时候不能省略？用来区分局部变量和实例变量的时候，“this.”不能省略
 */
public class User {
    private int id;
    private String name;

    //构造函数
    public User(int a, String s)
    {
        id = a;
        name = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //等号前面的this.id是实例变量id
        //等号后面的id是局部变量id
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
