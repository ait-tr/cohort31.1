package ait.string;

public class StringAppl {
    public static void main(String[] args) {
        byte x = 10;
        String str = "Hello";

        System.out.println(str);
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1; //str.concat(str1);
        System.out.println(str);
        System.out.println(str.length());
        char c = str.charAt(2);
        System.out.println(c);
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("==========================");
        String str2 = " WORLD";
        boolean check = str1.equalsIgnoreCase(str2);
        System.out.println(check);
        str2 = str.toUpperCase();
        System.out.println(str2);
        System.out.println(str);
        int index = str.indexOf('l');
        System.out.println(index);
        index = str.indexOf("lo");
        System.out.println(index);
        index = str.indexOf('l', 5);
        System.out.println(index);
        index = str.lastIndexOf('l');
        System.out.println(index);
        index = str.indexOf("lo", 5);
        System.out.println(index);
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));
        System.out.println(str.replace("l", "AAA"));
        System.out.println("============================");
        String text = "qwerty";
        String newText = new String("qwerty");
        check = text.equals(newText);
        System.out.println(check);
        System.out.println("============================");
        text = "one, two, three, four, five";
        String[] arr = text.split(", ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============================");
        String email = " John@gmail.com  ";
        System.out.println(email);
        email = email.trim().toLowerCase();
        System.out.println(email);
    }
}
