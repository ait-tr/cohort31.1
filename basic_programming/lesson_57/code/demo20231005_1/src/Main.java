import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
    }

    public void temp(List<Person> list){
        Comparator<Person> comparatorPerson2 = new Comparator<>() { //X00Compar
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };

        ComparatorPerson comparatorPerson = new ComparatorPerson();
        list.sort(comparatorPerson2);
        list.sort(    (o1, o2) -> { return o1.getAge()- o2.getAge(); }   );


        /*
        list.sort(new Comparator<>() { //X00Compar
            @Override
            public int compare(Person o1, Person o2) {
                    return o1.getAge()- o2.getAge();
            }
        });
        */
    }

}