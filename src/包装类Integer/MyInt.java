package 包装类Integer;

/*
1.这种包装类目前是我自己写的，实际开发中不需要自己写
2.8种基本数据类型对应的8种包装类，SUN公司已经写好了，我们直接用
 */
public class MyInt {
    int value;

    public MyInt(){

    }

    public MyInt(int value){
        this.value  = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
