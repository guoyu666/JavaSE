package 接口.Example04;

/**
 * equals方法重写的时候要彻底
 */
public class Test03 {
    public static void main(String[] args) {
        customer u1 = new customer("郭雨", new Address("北京", "大兴区", "1111"));
        customer u2 = new customer("郭雨", new Address("北京", "大兴区", "1111"));
        customer u3 = new customer("郭雨",new Address("北京","朝阳区","1111"));

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));

    }
}

class customer {
    //用户名
    String name;
    //家庭住址
    Address addr;

    public customer() {

    }

    public customer(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法，当一个用户的用户名和家庭住址都相同，表示同一个用户
    //这个equals判断的是User对象和User对象是否相等
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof customer)) return false;
        if (this == obj) return true;

        customer u = (customer) obj;    //强制类型转换
        if (this.name.equals(u.name) && this.addr.equals(u.addr)) {
            return true;
        }
        return false;
    }
}

class Address {
    String city;
    String street;
    String zipcode;

    public Address() {

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    //注意：这里一开始并没有重写equals方法
    //这里的equals方法判断的是：Address和Address对象是否相等
    //Address中的equals方法没有重写的时候，比较的是对象的内存地址
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof Address)) return false;
        if (this == obj) return true;

        Address add = (Address) obj;        //强制类型转换
        if (this.city.equals(add.city) && this.street.equals(add.street) && this.zipcode.equals(add.zipcode)) {
            return true;
        }
        return false;
    }

}
