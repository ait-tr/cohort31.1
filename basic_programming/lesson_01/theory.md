Java – высокоуровневый язык программирования, изначально разработанный компанией
Sun Microsystems и выпущенный в 1995 году. 
Работает на различных платформах, таких как Windows, Mac OS, 
а также различных версий UNIX.

Java – это язык программирования общего назначения, предназначенный для того, чтобы программисты 
могли писать один раз и запускать где угодно (WORA). Это означает, что скомпилированный код Java 
может работать на всех платформах, поддерживающих Java, без необходимости повторной компиляции.


Изучать язык программирования обычно начинают с программы 'Hello, World!', которая выводит этот текст на экран.
```console
Hello, World!
```
В языке Java эта программа будет выглядеть так:
```java
  class Main2 { 
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
```

На данном этапе нам не важно,
Текст *Hello, World!* появится на экране благодаря команде `System.out.println()`, 
где `println()` - это сокращение от английского *print line*. Она выводит на экран значение, указанное в скобках 
`("Hello, World!")`, в данном случае строку. Сама строка обрамляется двойными кавычками "". 
Если этого не сделать, то компилятор укажет на синтаксическую ошибку.

**Очень важно знать и помнить следующие моменты в синтаксисе языка Java:**

**Чувствительность к регистру** 
– Java чувствителен к регистру, то есть идентификатор Hello и hello имеют разный смысл. 

Название классов – для всех **первая буква должна быть в верхнем регистре**. 

Если несколько слов используются, чтобы сформировать название класса, первая буква каждого внутреннего слова 
должна быть в верхнем регистре, например, «MyJavaClass». Название методов – в синтаксисе Java все имена методов 
должны начинаться с буквы нижнего регистра. Если несколько слов используются, чтобы сформировать имя метода, то 
первая буква каждого внутреннего слова должна быть в верхнем регистре, например, «public void myMethodName()». 

**Название файла программы = класса** 
– наименование файла программы должно точно совпадать с именем класса. 
При сохранении файла, Вы должны сохранить его, используя имя класса (помните о чувствительности к регистру) 
и добавить «.java» в конце имени (если имена не совпадают, Ваша программа не будет компилироваться), например, 
«MyJavaProgram» – это название класса, тогда файл должен быть сохранен как «MyJavaProgram.java». 

public static void main(String args[]) – обработка программы начинается с метода main(), который является обязательной 
частью каждой программы. Идентификаторы – имена, используемые для классов, переменных и методов. 
Все компоненты Java требуют имена.

Существует несколько правил в синтаксисе языка Java, которые необходимо помнить об идентификаторе. 
Они следующие:
Каждый идентификатор должен начинаться с «A» до «Z» или «a» до «z», «$» или «_». 
После первого символа может иметь любую комбинацию символов. Ключевое слово не может быть использовано в качестве 
идентификатора. 
Самое важное – идентификатор в Java чувствителен к регистру!
Пример правильного написания: age, $salary, _value, __1_value. Пример неправильного написания: 123abc, -salary. 

**Ключевые слова** 
Всего зарезервировано 50 служебных (ключевых) слов в Java.

Список ключевых слов по алфавиту:

abstract assert boolean break byte case catch char class const continue default do double else enum extends 
final finally float for goto if implements import instanceof int interface long native new package private 
protected public return short static strictfp super switch synchronized this throw throws transient try 
void volatile while

**Важно!** Ключевое слово не может быть употреблено в качестве константы или переменной, или любых других 
имен идентификаторов.

**Полезно!** Составить свой мини-словарь с переводом ключевых слов.