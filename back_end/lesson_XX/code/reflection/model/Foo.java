package reflection.model;

public class Foo {

    // определяем методы, которые будут получать на вход аргумент типа String и печатать эту строку
    // имитируем "выдох"

    public void f1(String str) {
        System.out.println("f1 " + str);
    }

    public void f2(String str) {
        System.out.println("f2 " + str);
    }

    public void f3(String str) {
        System.out.println("f3 " + str);
    }

    public void f4(String str) {
        System.out.println("f4 " + str);
    }

    public void f5(String str) {
        System.out.println("f5 " + str);
    }

    // приватный метод, типа закрытый для обращения к нему
    private void f_private(String str) {
        System.out.println("f_private " + str);
    }

}
