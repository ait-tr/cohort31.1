** TreeSet **

E first(): returns the first element of a set

E last(): returns the last element of a set

SortedSet<E> headSet(E end): Returns a SortedSet object that contains all the elements of the primary set up to the end element

SortedSet<E> subSet(E start, E end): returns a SortedSet object that contains all the elements of the primary set between the elements start and end

SortedSet<E> tailSet(E start): Returns a SortedSet object that contains all elements of the primary set, starting with the start element

E ceiling(E obj): Searches the set for the smallest element e that is greater than obj (e >=obj). If such an element is found, it is returned as the result. Otherwise null is returned.

E floor(E obj): Finds the largest element e in a set that is smaller than obj (e <=obj). If such an element is found, it is returned as the result. Otherwise null is returned.

E higher(E obj): Searches the set for the smallest element e that is greater than obj (e >obj). If such an element is found, it is returned as the result. Otherwise null is returned.

E lower(E obj): Finds the largest element e in a set that is smaller than obj (e < obj). If such an element is found, it is returned as the result. Otherwise null is returned.

E pollFirst(): returns the first element and removes it from the set

E pollLast(): returns the last element and removes it from the set

NavigableSet<E> descendingSet(): Returns a NavigableSet object that contains all the elements of the primary NavigableSet in reverse order

NavigableSet<E> headSet(E upperBound, boolean incl): Returns a NavigableSet object that contains all elements of the primary NavigableSet up to upperBound. The incl parameter, when set to true, allows you to include the upperBound element in the output set

NavigableSet<E> tailSet(E lowerBound, boolean incl): Returns a NavigableSet object that contains all elements of the primary NavigableSet, starting with lowerBound. The incl parameter, when set to true, allows you to include the lowerBound element in the output set

NavigableSet<E> subSet(E lowerBound, boolean lowerIncl, E upperBound, boolean highIncl): Returns a NavigableSet object that contains all elements of the primary NavigableSet from lowerBound to upperBound.




**TreeMap**

K firstKey(): returns the key of the first display element

K lastKey(): returns the key of the last display element

SortedMap<K, V> headMap(K end): Returns a SortedMap that contains all the elements of the original SortedMap up to the element with key end

SortedMap<K, V> tailMap(K start): returns a SortedMap that contains all the elements of the original SortedMap, starting with the element with key start

SortedMap<K, V> subMap(K start, K end): returns a SortedMap that contains all the elements of the original SortedMap, from the element with the key start to the element with the key end

Map.Entry<K, V> ceilingEntry(K key): Returns the element with the smallest key k that is greater than or equal to key (k >=key). If there is no such key, then null is returned.

Map.Entry<K, V> floorEntry(K key): Returns the element with the largest key k that is less than or equal to key (k <=key). If there is no such key, then null is returned.

Map.Entry<K, V> higherEntry(K key): Returns the element with the lowest key k that is greater than key (k >key). If there is no such key, then null is returned.

Map.Entry<K, V> lowerEntry(K key): Returns the element with the largest key k that is less than key (k <key). If there is no such key, then null is returned.

Map.Entry<K, V> firstEntry(): returns the first element of the display

Map.Entry<K, V> lastEntry(): returns the last element of the display

Map.Entry<K, V> pollFirstEntry(): returns and simultaneously removes the first element from the map

Map.Entry<K, V> pollLastEntry(): returns and simultaneously removes the last element from the map

K ceilingKey(K key): Returns the smallest key k that is greater than or equal to key (k >=key). If there is no such key, then null is returned.

K floorKey(K key): Returns the largest key k that is less than or equal to key (k <=key). If there is no such key, then null is returned.

K lowerKey(K key): Returns the largest key k that is less than key (k < key). If there is no such key, then null is returned.

K higherKey(K key): Returns the smallest key k that is greater than key (k >key). If there is no such key, then null is returned.

NavigableSet<K> descendingKeySet(): Returns a NavigableSet object that contains all display keys in reverse order

NavigableMap<K, V> descendingMap(): Returns a NavigableMap that contains all elements in reverse order

NavigableSet<K> navigableKeySet(): Returns a NavigableSet object that contains all the display keys

NavigableMap<K, V> headMap(K upperBound, boolean incl): Returns a NavigableMap that contains all the elements of the original NavigableMap up to the element with key upperBound. The incl parameter, when true, specifies that the element with the key upperBound is also included in the output set.

NavigableMap<K, V> tailMap(K lowerBound, boolean incl): Returns a NavigableMap that contains all the elements of the original NavigableMap, starting with the element with key lowerBound. The incl parameter, when true, specifies that the element with the lowerBound key is also included in the output set.

NavigableMap<K, V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): Returns a NavigableMap that contains all the elements of the original NavigableMap from the element with key lowerBound to the element with key upperBound. The lowIncl and highIncl parameters, when set to true, include in the output set elements with the lowerBound and upperBound keys, respectively.





** TreeSet **

E first(): возвращает первый элемент набора

E last(): возвращает последний элемент набора

SortedSet<E> headSet(E end): возвращает объект SortedSet, который содержит все элементы первичного набора до элемента end

SortedSet<E> subSet(E start, E end): возвращает объект SortedSet, который содержит все элементы первичного набора между элементами start и end

SortedSet<E> tailSet(E start): возвращает объект SortedSet, который содержит все элементы первичного набора, начиная с элемента start

E ceiling(E obj): ищет в наборе наименьший элемент e, который больше obj (e >=obj). Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.

E floor(E obj): ищет в наборе наибольший элемент e, который меньше элемента obj (e <=obj). Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.

E higher(E obj): ищет в наборе наименьший элемент e, который больше элемента obj (e >obj). Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.

E lower(E obj): ищет в наборе наибольший элемент e, который меньше элемента obj (e <obj). Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.

E pollFirst(): возвращает первый элемент и удаляет его из набора

E pollLast(): возвращает последний элемент и удаляет его из набора

NavigableSet<E> descendingSet(): возвращает объект NavigableSet, который содержит все элементы первичного набора NavigableSet в обратном порядке

NavigableSet<E> headSet(E upperBound, boolean incl): возвращает объект NavigableSet, который содержит все элементы первичного набора NavigableSet до upperBound. Параметр incl при значении true, позволяет включить в выходной набор элемент upperBound

NavigableSet<E> tailSet(E lowerBound, boolean incl): возвращает объект NavigableSet, который содержит все элементы первичного набора NavigableSet, начиная с lowerBound. Параметр incl при значении true, позволяет включить в выходной набор элемент lowerBound

NavigableSet<E> subSet(E lowerBound, boolean lowerIncl, E upperBound, boolean highIncl): возвращает объект NavigableSet, который содержит все элементы первичного набора NavigableSet от lowerBound до upperBound.





** TreeMap **

K firstKey(): возвращает ключ первого элемента отображения

K lastKey(): возвращает ключ последнего элемента отображения

SortedMap<K, V> headMap(K end): возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap вплоть до элемента с ключом end

SortedMap<K, V> tailMap(K start): возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap, начиная с элемента с ключом start

SortedMap<K, V> subMap(K start, K end): возвращает отображение SortedMap, которые содержит все элементы оригинального SortedMap вплоть от элемента с ключом start до элемента с ключом end

Map.Entry<K, V> ceilingEntry(K key): возвращает элемент с наименьшим ключом k, который больше или равен ключу key (k >=key). Если такого ключа нет, то возвращается null.

Map.Entry<K, V> floorEntry(K key): возвращает элемент с наибольшим ключом k, который меньше или равен ключу key (k <=key). Если такого ключа нет, то возвращается null.

Map.Entry<K, V> higherEntry(K key): возвращает элемент с наименьшим ключом k, который больше ключа key (k >key). Если такого ключа нет, то возвращается null.

Map.Entry<K, V> lowerEntry(K key): возвращает элемент с наибольшим ключом k, который меньше ключа key (k <key). Если такого ключа нет, то возвращается null.

Map.Entry<K, V> firstEntry(): возвращает первый элемент отображения

Map.Entry<K, V> lastEntry(): возвращает последний элемент отображения

Map.Entry<K, V> pollFirstEntry(): возвращает и одновременно удаляет первый элемент из отображения

Map.Entry<K, V> pollLastEntry(): возвращает и одновременно удаляет последний элемент из отображения

K ceilingKey(K key): возвращает наименьший ключ k, который больше или равен ключу key (k >=key). Если такого ключа нет, то возвращается null.

K floorKey(K key): возвращает наибольший ключ k, который меньше или равен ключу key (k <=key). Если такого ключа нет, то возвращается null.

K lowerKey(K key): возвращает наибольший ключ k, который меньше ключа key (k <key). Если такого ключа нет, то возвращается null.

K higherKey(K key): возвращает наименьший ключ k, который больше ключа key (k >key). Если такого ключа нет, то возвращается null.

NavigableSet<K> descendingKeySet(): возвращает объект NavigableSet, который содержит все ключи отображения в обратном порядке

NavigableMap<K, V> descendingMap(): возвращает отображение NavigableMap, которое содержит все элементы в обратном порядке

NavigableSet<K> navigableKeySet(): возвращает объект NavigableSet, который содержит все ключи отображения

NavigableMap<K, V> headMap(K upperBound, boolean incl): возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap вплоть от элемента с ключом upperBound. Параметр incl при значении true указывает, что элемент с ключом upperBound также включается в выходной набор.

NavigableMap<K, V> tailMap(K lowerBound, boolean incl): возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap, начиная с элемента с ключом lowerBound. Параметр incl при значении true указывает, что элемент с ключом lowerBound также включается в выходной набор.

NavigableMap<K, V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): возвращает отображение NavigableMap, которое содержит все элементы оригинального NavigableMap от элемента с ключом lowerBound до элемента с ключом upperBound. Параметры lowIncl и highIncl при значении true включают в выходной набор элементы с ключами lowerBound и upperBound соответственно.