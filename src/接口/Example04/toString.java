package 接口.Example04;

/**
 * 1.toString源代码长什么样？ --类名 + @ + 对象的内存地址转换为十六进制的形式
 * 2.设计toString的目的 -- 通过调用这个方法，可以将一个java对象转换成“字符串”的形式
 * 3.建议所有的子类去重写toString方法
 */
public class toString {
   public static void main(String[] args){
       Mytime t1 = new Mytime(1970,1,1);
       String s1 = t1.toString();

       //Mytime类重写toString（）方法之前
       System.out.println(s1);

       //输出引用的时候，会自动调用该格式
       System.out.println(t1);
   }

}
class Mytime
{
    int year;
    int month;
    int day;

    public Mytime(){

    }

    public Mytime(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //重写toString方法
    public String toString(){
        return this.year + "年" + this.month + "月" + this.day + "日";
    }

}
