Русский текст смотри ниже
<ol>
<li> Starting from Java 8, default methods can be used in interfaces. Such a method is marked with the keyword default and has a ready-made implementation. Default methods do not have to be overridden.
</li>
<li> The fields of an interface are constants by default. That is, marked as public static final.
</li>
<li> Starting from Java 5, Generics appeared in the language - parameterized types and methods. The task of generics is to make it possible to write universal strictly typed code, in which the decision about the specific type is postponed "for later". For example, the type on which the object "specializes" is determined not at the time of creating the class, but at the time of creating the object. The parameter (generic) is specified in angle brackets - <T>.
</li>
<li> Starting from Java 8, there is an interface Predicate<T>. In this interface, there is only one abstract method: boolean test(T t); Objects of type Predicate are used to organize selection by condition (filtering).
</li>
<li> In Java, you can create objects of anonymous classes. That is, create objects of interfaces or abstract classes, while immediately implementing abstract methods on the spot. Starting from Java 8, for interfaces and abstract classes that have only one abstract method, you can use a simplified syntax of lambda expressions: (arguments) -> method body
</li>
</ol>
1. Начиная с Java 8 в интерфейсах можно использовать дефолтные методы. 
Такой метод помечается ключевым словом default и имеет готовую реализацию. 
Дефолтные методы не обязательно переопределять.

2. Полями интерфейса по умолчанию являются константы. Т. е. помеченные как public static final.

3. Начиная с Java 5 в языке появились Generics - параметризованные типы и методы. 
Задача дженериков, сделать возможным писать универсальный строго типизированный код, в котором решение
о конкректном типе откладывается "на потом". Например тип на котором "специализируется" объект 
определяется не в момент создания класса, а в момент создания объекта. 
Параметр (generic) указывается в угловых скобках - <T>.

4. Начиная с Java 8, появился интерфейс Predicate<T>. 
В этом интерфейсе есть единственный абстрактный метод: boolean test(T t); 
Объекты типа Predicate используются для организации выборки по условию (фильтрации). 

5. В Java можно создавать объекты анонимных классов. Т. е. создавать объекты интефейсов, или абстрактных классов, 
при этом сразу, на месте, имплементируя абстрактные методы. Начиная с Java 8, для интерфейсов и абстрактных классов 
имеющих только один абстрактный метод, можно использовать упрощенный синтаксис лямбда выражений: 
(arguments) -> method body. 