import java.util.*;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<Person> list = new OurLinkedList<>();
        Person p1 = new Person("Jack");
        list.append(p1);
        list.append(new Person("John"));
        list.append(new Person("Oleg"));


/*
        System.out.println(list.get(1));

        list.set(new Person("Oleg"), 1);
        System.out.println(list.get(1));
*/

        list.print();
        list.removeById(2);
        list.removeById(1);
        list.removeById(0);




        System.out.println("-----------");
        list.print();

        System.out.println("-------");
        list.append(new Person("John"));
        list.append(new Person("Jack"));
        list.append(new Person("Oleg"));
        list.removeById(1);
        list.print();
        System.out.println("-------");
        list.removeById(0);
        list.print();

        //
        System.out.println("---- iterator -----");

        List<String> strList = new LinkedList<>();
        strList.add("str1");
        strList.add("str2");
        strList.add("str3");
        strList.add("str4");

        for (int i = 0; i <strList.size() ; i++) {
            System.out.println(strList.get(i));
        }

        Iterator<String> iterator=strList.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            iterator.remove();
        }

        ListIterator<String> listIterator = strList.listIterator();

        for(String s:strList){

        }


        System.out.println("---- my iterator -----");
        OurLinkedList<Integer> myIntList = new OurLinkedList<>();
        myIntList.append(1);
        myIntList.append(2);
        myIntList.append(3);
        myIntList.append(4);
        myIntList.append(5);


        for (Integer i:myIntList){
            System.out.println(i);
        }


        /* ERROR!!!!

        for (int i = 0; i < strList.size(); i++) {
            if (   ) strList.remove(strList.get(i));
        }

         */

        // 1
        Iterator<String> iterator1 = strList.iterator();
        while (iterator1.hasNext()){
            if(    ) iterator1.remove();
        }
        // 2
        strList.removeIf();


    }
}
