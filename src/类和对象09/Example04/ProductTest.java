package 类和对象09.Example04;

public class ProductTest {
    public static void main(String[] args)
    {
        Product  iphone = new Product();        //创建对象
        /*System.out.println("商品的编号为： " + iphone.productNo);
        System.out.println("商品的单价为： " + iphone.price);*/

        iphone.productNo = 111;
        iphone.price = 6800;

        System.out.println("商品的编号为： " + iphone.productNo);
        System.out.println("商品的单价为： " + iphone.price);

    }

}
