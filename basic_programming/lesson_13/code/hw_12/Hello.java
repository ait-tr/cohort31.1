package hw_12;

public class Hello {
    public static void main(String[] args) {
//        Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
//        Пример: Hello-> EL
//        В методе main()  вывести получившийся результат на экран

        String st = "Hello"; // определили строку
        String result = hello2Symbols(st); // вызвали метод, передали в него st, результат метода присвоили в переменную
        System.out.println(result); // напечатали

        // альтернативно
        System.out.println(hello2Symbols(st));

    }
    //======= Methods =========
    public static String hello2Symbols (String s) {
        return s.substring(1, 3).toUpperCase(); // метод возвращает второй и третий символы строки заглавными буквами
    }
    //=========================
}
