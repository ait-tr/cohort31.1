package reflection;

public class ReflectionAppl {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<String> clazzStr1 = String.class; // 1-й способ получить ссылку на объект рефлексии
        System.out.println(clazzStr1);

        String str = "Hello!";

        Class<? extends String> clazzStr2 = str.getClass(); // 2-й способ, это называется wild card
        System.out.println(clazzStr2);

        //getClass участвовал в методе equals

        Class<?> clazzStr3 = Class.forName("java.lang.String");
        System.out.println(clazzStr3);

        // это три ссылки на ОДИН и ТОТ ЖЕ ОБЪЕКТ РЕФЛЕКСИИ
        System.out.println(clazzStr1 == clazzStr2);
        System.out.println(clazzStr2 == clazzStr3);

        // так создавали пустой объект типа String
        // String str1 = "";
        // String str1 = new String();
        // так создается объект с помощью объекта рефлексии
        String str1 = (String) clazzStr3.newInstance();
        // Объекты рефлексии есть для всех типов
        Class<?> clazzInt = int.class;
        System.out.println(clazzInt);
        Class<?> clazz = void.class;
        System.out.println(clazz);

    }
}
