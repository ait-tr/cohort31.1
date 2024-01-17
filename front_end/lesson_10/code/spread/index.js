// Spread 
const fruits = ["apple", "orange"];
// Две переменные, но массив сам один
const newFruits = fruits;
// Мы можем на заметить проблемы
fruits[0] = "banana";   
console.log(newFruits[0]); // "banana"
newFruits[2] = "pear";
console.log(fruits);
// Как сделать новый массив, с элементами скопированными из первого?
// Скопируем в новый массив все элементы исходного, чтобы это были независимые массивы

const independentFruits = [...fruits];
// создали копию исходного массива - если будем менять - исходник не изменится
independentFruits[3] = 'kiwi';
console.log(independentFruits); // [ 'banana', 'orange', 'pear', 'kiwi' ]
console.log(fruits); // [ 'banana', 'orange', 'pear' ]

// Пример 2 
const cars = ["BMW", "Porsche"];

const myCars = [...cars, "Mercedes"]; 
console.log(myCars); // [ 'BMW', 'Porsche', 'Mercedes' ]

// Пример 3
const myFriends = ["Roma", "Petr"];
const myWifesFriends = ["Fedor", "Frosya"];

const commonFriends = [...myFriends, ...myWifesFriends];
console.log(commonFriends); // [ 'Roma', 'Petr', 'Fedor', 'Frosya' ]

