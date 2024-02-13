
***Stram***

In Java, java.util.Stream interface represents a *data stream* on which one or more operations can be performed. 
*Data stream* can be defined as a sequence of elements. Stream provide *functional-style* data processing regardless of data source.  
The source of elements here refers to a Collection or Array or FileInputStream or something else that provides data. 
Simply put, Java Stream API is a powerful and efficient way to process data

Stream operations are either *intermediate* or *terminal*. The *terminal* operations return a result of a certain type, and intermediate operations return the stream itself so we can chain 
multiple methods in a row to perform the operation in multiple steps.

**A stream does not store data and, in that sense, is not a data structure. It also never modifies the underlying data source.**



В Java интерфейс java.util.Stream представляет *поток данных*, над которым можно выполнить одну или несколько операций.
*stream* можно определить как последовательность элементов. Stream обеспечивает обработку данных в функциональном стиле независимо от источника данных.
Источником элементов здесь можнт являтся коллекция, массив, файл или что-то еще, предоставляющее данные.

Проще говоря, Java Stream API — это мощный и эффективный способ обработки данных.

Потоковые операции бывают либо *промежуточными* (например, map(), filter(), flatMap() и т.д.), либо *терминальными* (например, count(), forEach(), toList() и т.д.). Терминальные возвращают результат определенного типа 
(оист, сет, число), а промежуточные операции возвращают поток, поэтому мы можем объединить несколько методов подряд, чтобы выполнить операцию в несколько этапов.

**Поток не хранит данные и в этом смысле не является структурой данных (как, например, коллекция). Он также никогда не изменяет базовый источник данных.**
