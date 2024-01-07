public interface OurList<E> extends Iterable<E> {

    void append(E o); // добавлять элемент

    E get(int index); // получение элемента по его индексу

    void set(E o, int index); // устанавливаем элемент на место по индексу

    int size(); // размер листа

    boolean contains(E o); // содержится ли такой объект в листе

    boolean remove(E o); // удаление объекта из листа

    E removeById(int index); // удаление элемента по индексу

}
