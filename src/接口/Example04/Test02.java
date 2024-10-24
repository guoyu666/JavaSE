package 接口.Example04;

public class Test02 {
    public static void main(String[] args){
        Student s1 = new Student(111, "成都七中");
        Student s2 = new Student(111, "成都七中");
        System.out.println(s2 == s1);
        System.out.println(s1.equals(s2));
    }
}

class Student{
    int number;
    String school;

    public Student(){

    }

    public Student(int number, String school){
        this.number = number;
        this.school = school;
    }

    //重写toString方法
    public String toString(){
        return "学号" + number + ", 所在学校的名称" + school;
    }

    //重写equals方法
    public boolean equals(Object obj){
        if (obj == null && !(obj instanceof Student))
            return false;
        if (this == obj)
            return true;

        Student s = (Student) obj;
        if (this.number == s.number && this.school.equals(s.school))        //String对象比较的时候必须使用equals方法
            return true;
        else
            return false;
    }
}
