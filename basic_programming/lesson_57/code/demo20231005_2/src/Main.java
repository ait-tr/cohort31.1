import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        double sum= calc(10, 10, new DoubleOperation() {
            @Override
            public double apply(double num1, double num2) {
                return num1+num2;
            }
        });
        sum = calc( 10,10,    (num1,num2) -> {return num1+num2;}     );



        double pow= calc(2, 3, new DoubleOperation() {
            @Override
            public double apply(double num1, double num2) {
                return Math.pow(num1,num2);
            }
        });
        pow= calc(2,3,(n1,n2)->{ return  Math.pow(n1,n2); });
        double min = calc(3,5, (n1,n2)->{return Math.min(n1,n2)*10;} );
        double res = calc(3,5, (n1,n2)->{return n1*n2/2+n1;} );

        List<String> strings = List.of("jack", "JoHn", "ann", "Nick");

        System.out.println(strListHandler(strings, (s) -> {
            return s.toUpperCase();
        }));

        System.out.println(strListHandler(strings, (s) -> {
            return s.toLowerCase();
        }));

        System.out.println(strListHandler(strings, (s) -> {
            return "user: "+s;
        }));

        System.out.println(strListHandler(strings, (s) -> {
            return "user: "+s.toUpperCase();
        }));

        System.out.println(strListHandler(List.of(1,2,3,4), (i) -> {
            return i*2;
        }));

        System.out.println(strListHandler(List.of(1,2,3,4),  i  ->  Integer.bitCount(i)  ));

    }

// (num1, num2) -> {return num1+num2; }
// (num1, num2) -> num1+num2
// ()-> System.out.println("Hi!")

    // return  num1+num2;
    // return num1-num2;
    // return num1/num2;
    public static double calc(double num1, double num2, DoubleOperation operation){
        return operation.apply(num1, num2);
    }

    public  static <T> List<T> strListHandler(List<T> list, StringTransformer<T> transformer){
        List<T> res= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(transformer.transform(list.get(i)));
        }
        return res;
    }


}
