// Массив
// в JS не фиксированной длинны, напоминает лист из Java
// 1. Создание пустой массива
// первый способ
const arr1 = [];
console.log(typeof arr1); // object
// второй способ
const arr2 = new Array();

// 2. Как создать уже с элементами?
const fruits = ["apple", "orange", "lime"];
console.log(fruits);

// 3. Как изменить значение по индексу?
// хочу заменить orange на banana
// индексация с нуля как в java
fruits[1] = "banana";
// 4. Как пройтись циклом и вывести все элементы в консоль
for(let i = 0; i < fruits.length; i++){
  console.log(fruits[i]);
}

// 5. некоторые методы массивов: push, pop, shift, unshift
const students = ["Pavel", "Anastasia", "Juri"];
console.log(students); // [ 'Pavel', 'Anastasia', 'Juri' ]

// push - добавляет указанный элемент в конец массива
students.push("Oleksandr"); 
console.log(students); // [ 'Pavel', 'Anastasia', 'Juri', 'Oleksandr' ]

// pop - возращает и убирает последний элемент из массива
const olekasandr = students.pop();
console.log(students); // [ 'Pavel', 'Anastasia', 'Juri' ]

// unshift - добавляет элемент в начало
students.unshift("Egor");
console.log(students); // [ 'Egor', 'Pavel', 'Anastasia', 'Juri' ]

// shift удаляет элемент из начала массива и возвращет его 
const egor = students.shift();
console.log(students); // [ 'Pavel', 'Anastasia', 'Juri' ]