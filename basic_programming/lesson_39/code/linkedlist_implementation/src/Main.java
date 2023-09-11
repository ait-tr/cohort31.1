public class Main {
    public static void main(String[] args) {
        OurLinkedList<Person> list = new OurLinkedList<>();
        Person p1 = new Person("Jack");
        list.append(p1);
        list.append(new Person("John"));

        System.out.println(list.get(1));

        list.set(new Person("Oleg"), 1);
        System.out.println(list.get(1));




    }
}
