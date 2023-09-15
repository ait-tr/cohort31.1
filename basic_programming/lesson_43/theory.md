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

E first(): ���������� ������ ������� ������

E last(): ���������� ��������� ������� ������

SortedSet<E> headSet(E end): ���������� ������ SortedSet, ������� �������� ��� �������� ���������� ������ �� �������� end

SortedSet<E> subSet(E start, E end): ���������� ������ SortedSet, ������� �������� ��� �������� ���������� ������ ����� ���������� start � end

SortedSet<E> tailSet(E start): ���������� ������ SortedSet, ������� �������� ��� �������� ���������� ������, ������� � �������� start

E ceiling(E obj): ���� � ������ ���������� ������� e, ������� ������ obj (e >=obj). ���� ����� ������� ������, �� �� ������������ � �������� ����������. ����� ������������ null.

E floor(E obj): ���� � ������ ���������� ������� e, ������� ������ �������� obj (e <=obj). ���� ����� ������� ������, �� �� ������������ � �������� ����������. ����� ������������ null.

E higher(E obj): ���� � ������ ���������� ������� e, ������� ������ �������� obj (e >obj). ���� ����� ������� ������, �� �� ������������ � �������� ����������. ����� ������������ null.

E lower(E obj): ���� � ������ ���������� ������� e, ������� ������ �������� obj (e <obj). ���� ����� ������� ������, �� �� ������������ � �������� ����������. ����� ������������ null.

E pollFirst(): ���������� ������ ������� � ������� ��� �� ������

E pollLast(): ���������� ��������� ������� � ������� ��� �� ������

NavigableSet<E> descendingSet(): ���������� ������ NavigableSet, ������� �������� ��� �������� ���������� ������ NavigableSet � �������� �������

NavigableSet<E> headSet(E upperBound, boolean incl): ���������� ������ NavigableSet, ������� �������� ��� �������� ���������� ������ NavigableSet �� upperBound. �������� incl ��� �������� true, ��������� �������� � �������� ����� ������� upperBound

NavigableSet<E> tailSet(E lowerBound, boolean incl): ���������� ������ NavigableSet, ������� �������� ��� �������� ���������� ������ NavigableSet, ������� � lowerBound. �������� incl ��� �������� true, ��������� �������� � �������� ����� ������� lowerBound

NavigableSet<E> subSet(E lowerBound, boolean lowerIncl, E upperBound, boolean highIncl): ���������� ������ NavigableSet, ������� �������� ��� �������� ���������� ������ NavigableSet �� lowerBound �� upperBound.





** TreeMap **

K firstKey(): ���������� ���� ������� �������� �����������

K lastKey(): ���������� ���� ���������� �������� �����������

SortedMap<K, V> headMap(K end): ���������� ����������� SortedMap, ������� �������� ��� �������� ������������� SortedMap ������ �� �������� � ������ end

SortedMap<K, V> tailMap(K start): ���������� ����������� SortedMap, ������� �������� ��� �������� ������������� SortedMap, ������� � �������� � ������ start

SortedMap<K, V> subMap(K start, K end): ���������� ����������� SortedMap, ������� �������� ��� �������� ������������� SortedMap ������ �� �������� � ������ start �� �������� � ������ end

Map.Entry<K, V> ceilingEntry(K key): ���������� ������� � ���������� ������ k, ������� ������ ��� ����� ����� key (k >=key). ���� ������ ����� ���, �� ������������ null.

Map.Entry<K, V> floorEntry(K key): ���������� ������� � ���������� ������ k, ������� ������ ��� ����� ����� key (k <=key). ���� ������ ����� ���, �� ������������ null.

Map.Entry<K, V> higherEntry(K key): ���������� ������� � ���������� ������ k, ������� ������ ����� key (k >key). ���� ������ ����� ���, �� ������������ null.

Map.Entry<K, V> lowerEntry(K key): ���������� ������� � ���������� ������ k, ������� ������ ����� key (k <key). ���� ������ ����� ���, �� ������������ null.

Map.Entry<K, V> firstEntry(): ���������� ������ ������� �����������

Map.Entry<K, V> lastEntry(): ���������� ��������� ������� �����������

Map.Entry<K, V> pollFirstEntry(): ���������� � ������������ ������� ������ ������� �� �����������

Map.Entry<K, V> pollLastEntry(): ���������� � ������������ ������� ��������� ������� �� �����������

K ceilingKey(K key): ���������� ���������� ���� k, ������� ������ ��� ����� ����� key (k >=key). ���� ������ ����� ���, �� ������������ null.

K floorKey(K key): ���������� ���������� ���� k, ������� ������ ��� ����� ����� key (k <=key). ���� ������ ����� ���, �� ������������ null.

K lowerKey(K key): ���������� ���������� ���� k, ������� ������ ����� key (k <key). ���� ������ ����� ���, �� ������������ null.

K higherKey(K key): ���������� ���������� ���� k, ������� ������ ����� key (k >key). ���� ������ ����� ���, �� ������������ null.

NavigableSet<K> descendingKeySet(): ���������� ������ NavigableSet, ������� �������� ��� ����� ����������� � �������� �������

NavigableMap<K, V> descendingMap(): ���������� ����������� NavigableMap, ������� �������� ��� �������� � �������� �������

NavigableSet<K> navigableKeySet(): ���������� ������ NavigableSet, ������� �������� ��� ����� �����������

NavigableMap<K, V> headMap(K upperBound, boolean incl): ���������� ����������� NavigableMap, ������� �������� ��� �������� ������������� NavigableMap ������ �� �������� � ������ upperBound. �������� incl ��� �������� true ���������, ��� ������� � ������ upperBound ����� ���������� � �������� �����.

NavigableMap<K, V> tailMap(K lowerBound, boolean incl): ���������� ����������� NavigableMap, ������� �������� ��� �������� ������������� NavigableMap, ������� � �������� � ������ lowerBound. �������� incl ��� �������� true ���������, ��� ������� � ������ lowerBound ����� ���������� � �������� �����.

NavigableMap<K, V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl): ���������� ����������� NavigableMap, ������� �������� ��� �������� ������������� NavigableMap �� �������� � ������ lowerBound �� �������� � ������ upperBound. ��������� lowIncl � highIncl ��� �������� true �������� � �������� ����� �������� � ������� lowerBound � upperBound ��������������.