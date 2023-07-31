public class Main {

    public static void main(String[] args) {
        int ints[] = {2,67,34,8};

        for ( int i = 0; i < ints.length; i++){

        //    System.out.println(ints[i]);
        }

        //for-each loop ( enhanced for )

        System.out.println("Print elements with for-each");

        for(int num : ints){
      //      System.out.println(num);
        }

        /*
        Цикл for-each  служит для перебора элементов массива без указания индексов и длины массива.
         создается "итерационная переменная" num, в которую последовательно
          на каждом шаге цикла записывается очередное значение элемента массива. Она записывается в скобках после
           ключевого слова for.  Дальше ставится двоеточие и справа от двоеточия пишется имя перебираемого массива
         */

        // continue
        // используется в цикле. Если программа встречает слово continue  то идущая за ним часть цикла пропускается
        // и происходит переход к выполнению следующей итерации цикла

      //  int arr[] = {2,67,34,8};

        for ( int i = 0; i < 5; i++){

            if (i == 3 ){
                continue;
            }
        //    System.out.println(i);
        }

        // Break ß
        // если в программе в цикле встечается слово break,  то происхлдит выход из цикла и переход к команде, сле-
       // дующей за циклом.

        for ( int i = 0; i < 100; i++){

            System.out.println(i);

            if ( i == 50){
                break;
            }
         //   System.out.println(i);
        }
        System.out.println("Out of for loop");
    }
}
