package 异常.homework;

public class UserService {
    public void register(String username, String password) throws IllegalNameException {
        //引用等于null的这个判断最好放在所有条件的最前面
        if (null == username || username.length() < 6 || username.length() > 14){
            throw new IllegalNameException("用户名不合法，长度必须在[6-14]之间");
        }

        //程序能够执行到此处，表示用户名合法
        System.out.println("注册成功，欢迎" + username);
    }


}
