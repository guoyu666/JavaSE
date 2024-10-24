package 数组.Example01;
/*
一维数组的深入，数组中存储的类型为：引用数据类型
对于数组来说，实际上只能存储java对象的“内存地址”，数组中存储的每个元素是“引用”
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] ans1 = {a1, a2};

        for (Animal a : ans1) {
            a.move();
        }

        //动态初始化一个长度为2的Animal类型数据
        Animal[] ans2 = new Animal[2];
        ans2[0] = new Animal();

        //Animal数组中只能存放Animal类型，不能存放Product类型
        //ans[1] = new Product(); ----->会报错

        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal
        ans2[1] = new Cat();

        for (Animal b : ans2) {
            b.move();
        }

        //创建一个Animal类型饿数组，数组中存储Cat和Bird对象
        //调用子类特有对象的话，需要向下转型
        Animal[] ans3 = {new Cat(), new Bird()};
        for (Animal c : ans3) {
            if (c instanceof Cat) {
                Cat cat = (Cat) c;
                cat.CatchMouse();
            } else if (c instanceof Bird) {
                Bird bird = (Bird) c;
                bird.Sing();

            }
        }

    }
}

class Animal {
    public void move() {
        System.out.println("Animal move....");
    }
}

//商品类
class Product {

}

//Cat是Animal的子类
class Cat extends Animal {
    public void move() {
        System.out.println("猫在走猫步");
    }

    //特有方法
    public void CatchMouse() {
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("鸟儿在飞");
    }

    //特有的方法
    public void Sing() {
        System.out.println("鸟儿在歌唱！");
    }
}

