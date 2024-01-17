package reflection.infra;

import reflection.model.Foo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class FooService {

    // поле для хранения объекта
    private Foo foo;

    // стандартный конструктор, создает объект типа FooService
    public FooService(Foo foo) {
        this.foo = foo;
    }


    // методы, получают на вход два аргумента
    // им передаем строки и печатаем
    public void caller(String funcName, String arg){

        // получаем объект рефлексии класса Foo
        Class<?> clazz = Foo.class;
        try {
            // подвергаем этот объект изучению (делаем интроспекцию)
            // Шаг 1: получаем метод для этого объекта
            Method method = clazz.getDeclaredMethod(funcName, String.class);
            method.setAccessible(true); // разрешаем доступ к методу
            // Шаг 2: получаем конструктор
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            // Шаг 3: вызываем полученный метод, даем ему аргументами конструктор и аргумент для исполнения
            method.invoke(constructor.newInstance(), arg); // .newInstance создает новый объект типа Foo
        } catch (Exception e) {
            e.printStackTrace(); // позволяет видеть возникающие ошибки
            System.out.println(funcName + " doesn't exists");
        }

//        switch (funcName) {
////            case "f1":
////                foo.f1(arg);
////                break;
////            case "f2":
////                foo.f2(arg);
////                break;
////            case "f3":
////                foo.f3(arg);
////                break;
////            case "f4":
////                foo.f4(arg);
////                break;
////            default:
////                System.out.println(funcName + " doesn't exists");
//        }
    }
}
