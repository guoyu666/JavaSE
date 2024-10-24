package 集合.bean;

import java.util.Objects;

public class Student {
    private String name;

    //无参数构造函数
    public Student() {
    }

    //有参数构造函数
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // hashCode

    // equals（如果学生名字一样，表示同一个学生。）
    /*public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Student)) return false;
        if(obj == this) return true;
        Student s = (Student)obj;
        return this.name.equals(s.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
