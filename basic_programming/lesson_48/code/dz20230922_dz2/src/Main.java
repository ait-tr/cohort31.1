/*
Написать метод, который получает в качестве парраметра строку длтнной 16 символов и,
если строка не соответствует этому требованию выбрасывает IllegalArgumentException

 */
public class Main {
    public static void main(String[] args) {
        check(null);
    }

    public static void check(String str){
        if(str==null || str.length()!=16) throw new IllegalArgumentException();
        System.out.println(str);
    }

}