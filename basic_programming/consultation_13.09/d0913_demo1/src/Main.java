
public class Main {
    public static void main(String[] args) {
        MyHashSet<String> mySet = new MyHashSet<>();
        mySet.add("112");
        mySet.add("113");
        mySet.add("1124");
        mySet.add("112555");
        mySet.add("1126");

        System.out.println(mySet.contains("113")); // true
        System.out.println(mySet.contains("113445")); // false


        System.out.println(mySet);

        System.out.println("-------------------");
        String s="jjjj";
        s= s.toUpperCase();
        String s2="jjjj";

        System.out.println(s==s2);


    }
}