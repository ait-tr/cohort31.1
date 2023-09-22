
** Exception **
[Exceptions](https://drive.google.com/file/d/1--0IQzS3m85hnfhMEjUSHTcNR87QZWMa/view?usp=sharing)

# Exception

An exception event is an event, which occurs during the execution of a program, that disrupts the normal flow of the program.
Exception is an object, that is thrown when an exception event  occurs within a method. Exception object contains information about the error, 
including its type and the state of the program when the error occurred.

## try...catch....finally

Java has *try...catch....finally* statement for exception handling:

~~~java
try{    
       // code that may throw an exception when executed 
   }  
catch (Exception e){  
      // code that handles the exception    
  }
finally {
     //code that executed in any case    
}
~~~


# Exception

*Exception* в Java представляют собой объект, генерируемый при возникновении исключительной ситуаций и содержащий информацию о ней.
*Исключительная ситуация* - аномальная ситуация, возникающая при работе программы и мешающая нормальному ходу выполнения программы. Например: не найден файл, перепонен диск при записи, прислали некорректные данные и т.д.

## try...catch....finally
В джаве предусмотрен встроенный механизм обработки исключений: 
~~~java
try{    
       // код, при выполнение которого может произойти исключительная ситуация 
   }  
catch (Exception e){  
      // код, который обрабатывае исключтьельную ситуацию    
  }
finally {
     //код, который должен быть выполнен при любом развитии событий    
}
~~~

- Блок `try` содержит контролируемый код, т.е. код который может привести к появлению Exception 
- Цель блока `catch` — исправление исключительных ситуаций, логирование события при необходимости и продолжение нормальной работы программы.
  Блок catch похож на метод, который исполняется,если произошло указанное в параметре исключение, а при вызове получает
объект Exception в качестве аргумента. Этот объект передается в переменной e.
- Блок `finally` является опциональным. Код в блоке finally выполняется в любом случае

Концептуально, конструкция try...catch отделяет нормальный поток выполнения программы от кода обработки исключительных ситуаций.   
Иногда говорят, что конструкция  try...catch позволяет *"поймать"* исключение.

В команде try может быть несколько секций catch, обрабатывающих разные
типы исключений (субклассы Exception):

~~~java
catch (FileNotFoundException e){  
      // код, который обрабатывае FileNotFoundException 
  } catch (IOException e){
       // код, который обрабатывае IOException и все его подклассы
  }catch(Exception e){
      //код, который обрабатывае Exception
  }
~~~

В этом случае, блоки catch располагаются последовательно, начиная с самого "узкого" до самого "широкого" эксепшена (в нашем примере, FileNotFoundException дочерний подкласс класса IOException, а IOException подкласс класса Exception)
Важно понимать, что секции catch обрабатываются последовательно с верху вниз. Таким образом, если сверху указать наиболее "широкий" класс, например Exception, все Exception будут перехвачены верхним блоком catch и до нижних система не дойдет. 
