package lesson22.homework22.eShop;
/*
#1

Допустим, у нас есть магазин. В нашем магазине есть товары трёх категорий: продукты, электроника, одежда. У каждого товара есть цена и наименование . У каждого товара есть метод купить
при покупки продуктов должна появиться дополнительная цена за срочность доставки.
при покупке электроники, покупателю оформляют гарантию (т.е. при покупке должен выполнятся метод “Оформить гарантию”)


Необходимо создать соответствующую структуру классов метод покупки товара.
Вы можете использовать класс “корзина” реализованный ранее.

 */


public class Main {


    public static void main(String[] args) {

        Cart cart = new Cart();
        cart.addProduct(new Aliment("yoghurt, 550 gr.", 4.5, 6.5));
        cart.addProduct(new Aliment("butter, 500 gr.", 5.5, 6.5));
        //cart.addProduct(new Aliment("sausage, 1000 gr.", 13.5, 6.5));
        //cart.addProduct(new Aliment("bread, 750 gr.", 2.5, 6.5));
        //cart.addProduct(new Aliment("beer, 24 cans", 20.5, 6.5));
        cart.addProduct(new Clothes("socks, 6 pair, size 35-38", 7.5));
        cart.addProduct(new Clothes("socks, 6 pair, size 39-42", 8.5));
        //cart.addProduct(new Clothes("T-shirt, size S", 7.0));
        //cart.addProduct(new Clothes("T-shirt, size M", 7.0));
        //cart.addProduct(new Clothes("T-shirt, size L", 7.5));
        //cart.addProduct(new Clothes("T-shirt, size XL", 7.5));
        cart.addProduct(new Electronics("Electric Kettle", 35.9));
        cart.addProduct(new Electronics("Milk Frother ", 19.9));
        //cart.addProduct(new Electronics("Filter Coffee Maker Machine ", 24.9));

        cart.placeOrder();


        System.out.println("----------------------------------");
        Product product = new Product("qweqwe",78.99);
        System.out.println(product);



    }
}
