package 异常.homework;
/*
自定义异常
 */
public class IllegalNameException extends Exception{
    public IllegalNameException(){

    }

    public IllegalNameException(String s){
        super(s);
    }
}
