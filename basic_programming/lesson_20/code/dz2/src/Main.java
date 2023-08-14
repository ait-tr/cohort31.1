/*
Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть). Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления и добавления товара в корзину. Реализовать метод, который распечатает весь заказ. Реализовать метод, который вернет сумму заказа.

 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] array= {
                new Product("product title 1", 8.6),
                new Product("product title 2", 81.3),
                new Product("product title 3", 10.5),
                new Product("product title 4", 1.6),
                new Product("product title 5", 4.2),
                new Product("product title 6", 3.6),
                new Product("product title 7", 4.0),
                new Product("product title 8", 8.6),
        };

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[2]);
        cart.add(array[6]);
        System.out.println(cart);

        cart.removeById(3);
        System.out.println(cart);

        System.out.println("Quantity:"+cart.quantity());
        System.out.println("Amount:"+cart.sum());


        System.out.println("--------------------------------------------------------");
               Product p1= new Product( "product title 2", 81.3);
               Product p2= new Product("product title 3", 10.5);



        System.out.println(p1);
        p1.temp=10;
        System.out.println(p2);
        System.out.println(p1);
        System.out.println(array[5]);
        array[0].temp++;
        System.out.println(p2);
        Product.temp=7658765;
        Product.print();

        //StaticDemo obj = new StaticDemo();
        //obj.printMsg("this is message");

        StaticDemo.printMsg("this is message");





    }
}