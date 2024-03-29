

===================================================================================

# Разработка приложения Budget Tracker

Протокол решения задачи:

1. пакет model, класс - Purchase, поля, конструктор и методы.
2. пакет dao, интерфейс - Budget, определяем методы для работы с бюджетом.
3. пакет dao, класс BudgetImpl - пока в нем методы пустые.
4. пакет tests, создаем BudgetImplTest.
5. подключили объект monthBudget, написали тесты, в них вызываем методы у объекта monthBudget
6. реализация методов в классе BudgetImpl
7. пакет dao, enum Menu - определяем поля (id, item), делаем конструктор, метод для печати меню


-----------------------------------------------------------------------------------

# Теория курса Java basic_programming (повторение)

## Системы счисления
10 - ая: десятичная, десятиричная система счисления.
0, 1, 2, 3, ..., 9 - цифры 

Основание - 10, каждая цифра числа получается % 10 (деление с остатком).
54321 % 10 = 1
54321 / 10 = 5432 - это целочисленное деление

8 - ая:
восьмиричная, 8, остатки от деления: 0, 1, 2, ... , 7
8(10) = 10(8)

16 - ая:
шестнадцатеричная, 16, 0, 1, 2, ... , 9 , A, B, С, D..., F

2 - ая:
двоичная, 2 - основание, 0, 1 
4 (10) = 100 (2)
5 (10) = 100 + 1 = 101 
6 (10) = 110 (2)
6 (10) = 110 (2) 
7 (10) = 111 (2)
8 (10) = 1000 (2)

## Примитивные типы данных
1 byte = 8 bit 
boolean, byte, short, char, int (4 byte), long (8 byte)
float, double

При объявлении каждой переменной необходимо объявить ее ТИП.

## Методы
- СИГНАТУРА метода:
  - модификатор доступа
  - тип возвращаемого методом значения
  - имя метода
  - в круглых скобках - параметры, аргументы
  
- название метода надо давать с маленькой буквы!!!
- если метод ничего не возвращает, то надо написать void (английское слово)
- конструктор - это ТОЖЕ МЕТОД

  `public int add(int a, int b) {
  // тело метода
  return a + b;
  }`

## Условие, тернарный оператор, switch case
    `if()`

    `if(condidtion) {
    } else {
    }`

тернарный оператор помогает сильно сократить код и должно быть простое условие
пример: 
    `int index < 0 ? -index : index;`

    `switch case` 
- организует код, когда множественный выбор

## Циклы - while, do while, for , for each


## Массивы

- String[] word - массив строк
- int[] numbers  - массив целых чисел

- int[] arr - массив целых чисел, его зовут arr

Как выглядит текущий элемент массива? - arr[i]
Следующий за ним?  - arr[i + 1]
Предыдущий элемент? - arr[i - 1]
Первый элемент? - arr[0]
Последний? - arr[length - 1]

arr.length - длина, кол-во элементов

## Сортировка массива
- пузырьковая: 
  - сравниваем два соседних элемента и они меняются местами по рез-ту сравнения
  - if(a[i] > a[i+1]){
  ...}
  ( a[5] = 10, a[6] = 7 производим вычитание 10-7=3>0, результат вычисления сравниваем с 0)
  
- сортировка выбором
  - последовательно проходим по всем элементам массива, цикл в цикле
  - ...

Они (сортировки) нужны, потому что БИНАРНЫЙ поиск в **отсортированном массиве** - это самый быстрый поиск O(log(n)).
Ищем индекс середины, сравниваем значение массива с искомым элементом, если меньше - то отбрасываем правую часть и т.д.

**Структурированное программирование:** 
все алгоритмы можно свести лишь к 4-м структурам:
- шаг 
- условие
- цикл
- вызов другой программы (вызов метода)

## Принципы ООП
- инкапсуляция (все в классе - поля и методы)
- полиморфизм (перегрузка методов, разный набор аргументов, методы можно называть одинаково!)
- наследование (extends класса, implements от интерфейса, реализуем принцип DRY)

- абстракция (абстрагируемся от конкретики, выделяем общие свойства объектов, берем только то, что нам надо...)


## Что такое класс, объекты, конструктор и т.д.
- класс - это ... 
- объект - это ...

- конструктор - это метод, который называется как класс, ничего не возвращает.  


## Абстрактные классы
- на базе абстрактного класса нельзя создавать объекты, объекты создаются - в дочерних классах.


## Интерфейсы
- содержат только абстрактные методы (нет тела).


## Классы-обертки
Integer, Byte, Character, Boolean, Double, Float, Long
Расширяют методы для работы с такими данными.
Эти классы содержат не примитивы, а **объекты**. 

## Enum
Класс, содержит перечислимый тип данных типа констант.
У каждой константы можно определить поля.


## Arrays, binarySearch
Arrays - это класс-обертка над array.

binarySearch - это метод, который возвращает индекс искомого элемента.
Индекс > 0 - элемент найден
Индекс < 0 - элемент НЕ найден, мог бы/должен стоять на - i - 1 месте.

## Generics
<T>, <E> - параметры интерфейсов, тип данных может быть/должен быть определен на этапе создания объекта.

## Comparable, Comparator
Comparable - для класса, задает метод compareTo, текущий сравниваем с присланным в метод. Желательно, чтобы
это был естественный (native) метод сортировки для объектов этого класса.

Компаратор - определяем на основе встроенного интерфейса в Java там, где нужен. Определяет метод compare (T o1, T o2).

## Complexity
O(1) - константная, конечное кол-во операций.
O(log(n)) - логарифмическая.
O(n) - линейная, кол-во операций прямо пропорционально кол-ву элементов.
O(n2) - квадратичная.
O(...)

## JCF структуры
Iterable - hasNex(), next()

Collection - sort, CRUD-методы, ...

Списки - List имеет нумерацию, очереди - ..., Множества - Set

Списки: возможны дубликаты, есть индексы элементов, сортируемы, поиск и добавление - O(n) - линейная, не нужно следить за размером.

Множества: уникальность элементов, НЕТ индексов, HashSet - НЕ сортируется, поиск и добавление - O(1) - константная.
- e-mail, телефонный номер, VIN, ID в базе данных, IBAN

TreeSet: уникальность элементов, НЕТ индексов, TreeSet - сортируется при наполнении элементами СРАЗУ, поиск и добавление - O(log(n)).

Map (мапа) - это комбинация/соединение **множества** ключей и **списков** их значений.

## Java Time API
см. примеры:
LocalDate.now - текущая дата
ChronoUnits - дни, недели, полнедели, полмесяца, месяц, век и т.д.

## Java Stream API


## Exceptions, try catch, throw
 


