
**Serialization and deserialization**

Serialization is a mechanism of converting the state of an object into a byte stream. 
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform. 
To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains writeObject() method for serializing an Object.

Only the objects of those classes can be serialized which are implementing java.io.Serializable interface. Serializable is a marker interface (has no data member and method). It is used to “mark” java 
classes so that objects of these classes may get certain capability.  

Points to remember 

1. Serialization is about the state of an object.  Only non-static data members are saved via Serialization process. Static data members are not saved via Serialization process.  
2.  if you don’t want to save value of a non-static data member then make it *transient*.   
3. Constructor of object is never called when an object is deserialized.   
4. Associated objects must be implementing Serializable interface.    


SerialVersionUID 
The serialization at runtime associates with each serializable class a version number called a serialVersionUID, 
which is used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization. 
The serialVersionUID of the serializable class in system that serializ the object must be the same  the serialVersionUID of the deserializable class in system that deserializ the object


Сериализация — это механизм преобразования состояния объекта в поток байтов.
Десериализация — это обратный процесс, при котором поток байтов используется для воссоздания фактического объекта Java в памяти. Этот механизм используется для сохранения объекта.

Создаваемый поток байтов не зависит от платформы. Таким образом, объект, сериализованный на одной платформе, может быть десериализован на другой платформе.
Чтобы сделать объект Java сериализуемым, необходимо реализовать интерфейс java.io.Serializable. Класс ObjectOutputStream содержит метод writeObject() для сериализации объекта.
Класс ObjectInputStream содержит метод readObject() для десериализации объекта.

Сериализовать можно только объекты тех классов, которые реализуют интерфейс java.io.Serializable. Serializable — это интерфейс маркера (не имеет элемента данных и метода). 
Он используется для «маркировки» классов Java, чтобы объекты этих классов могли получить определенные возможности.

Что следует помнить

1. Сериализация касается состояния объекта. В процессе сериализации сохраняются только нестатические элементы данных. Статические элементы данных не сохраняются в процессе сериализации.
2. если вы не хотите сохранять значение нестатического элемента данных, сделайте его *transient*.
3. Конструктор объекта никогда не вызывается при десериализации объекта.
4. Связанные объекты должны тоже реализовывать java.io.Serializable.


Серийная версияUID
Сериализация во время выполнения связывает с каждым сериализуемым классом номер версии, называемый SerialVersionUID.
который используется во время десериализации для проверки того, что отправитель и получатель сериализованного объекта загрузили классы для этого объекта, совместимые с сериализацией.
SerialVersionUID сериализуемого класса в системе, которая сериализует объект, должен совпадать с серийнымVersionUID десериализуемого класса в системе, которая десериализует объект.