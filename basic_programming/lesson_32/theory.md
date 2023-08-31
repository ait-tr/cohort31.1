Русский текст смотри ниже

<ol>
<li>
The static method Arrays.toString takes an array as an argument and returns its string representation.
</li>
<li>
The static method Arrays.sort allows you to sort an array. The method sort is overloaded. It allows you to sort arrays of primitive data, arrays of objects, if the objects are Comparable, and arrays of any objects, if a Comparator is also passed as an argument for comparing the elements of the array.
</li>
<li>
The static method Arrays.binarySearch searches for an element in an array using the binary search algorithm. The array must be sorted. Arrays.binarySearch must use the same comparator that was used to sort the array. Binary search returns the index of the searched element in the array. If the element is not found, then the index of the expected position for this element is returned with a minus sign, decreased by one (- expectedPosition - 1). The results of binary search in an unsorted array are not subject to interpretation.
</li>
</ol>

<ol>
<li>
Статический метод Arrays.toString, принимает в качестве аргумента массив, и возвращает его стринговое представление.
</li>
<li>
Статический метод Arrays.sort позволяет сортировать массив. Метод sort перегружен. 
Он позволяет сортировать массивы примитывный данных, массивы объектов, если объекты Comparable, и массивы любых объектов, если в качестве аргумента также передан Comparator для сравнения элементов массива.
</li>
<li>
Статический метод Arrays.binarySearch искать элемент в массиве, используя алгоритм бинарного поиска. 
При этом массив обязательно должен быть отсортирован. Arrays.binarySearch должен использовать тот же компаратор, 
при помощи которого массив был отсортирован. Бинарный поиск возвращает индекс искомого элемента в массиве. 
Если элемент не найден, то возвращается индекс ожидаемой позиции для этого элемента со знаком минус, 
уменьшенный на еденицу (- expectedPosition - 1). 
Результаты бинарного поиска в неотсортированном массиве не подлежат интерпретации.
</li>
</ol>