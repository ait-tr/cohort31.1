// Example 1 - Object literal
const student = {
  name: "Fred",
  age: 18
};
// key, value - ключ, значение
// получили значение по ключю
console.log(student.name); // Fred
console.log(student.job);  // undefined

// как записать новое значение по ключу?
student.name = "Feodor";
console.log(student.name); // Feodor
// если такого ключа не было
student.job = "journalist";
console.log(student); // { name: 'Feodor', age: 18, job: 'journalist' }

// Пример 2 Свойства из нескольких слов
const user = {name: "Semeon", age: 35, "cat name": "Murzik"};
// что делать если ключ состоит из нескольких слов? ""
console.log(user["cat name"]);
// создать новое свойство из двх слов
user["land of birth"] = "Cyprus";

// Пример 3 Как удалить свойство у объекта?
console.log(user);
delete user.age;    // удалит из объекта соответствующее свойство
console.log(user); // { name: 'Semeon', 'cat name': 'Murzik', 'land of birth': 'Cyprus' }
delete user["land of birth"];

// Пример 4 
const cat = {name: "Markiza", color: "grey"};
const key1 = "color";
// как по ключу сохраненному в переменной достать значение из объекта
console.log(cat.key1);  // undefied
console.log(cat[key1]); // grey
console.log(cat.color); // grey

// Пример 5 
// У нас есть переменные - и мы хотим создать из них объект
const brand = "Iphone";
const price = 200;
// создадим объект
const phone = {brand, price}; // { brand: 'Iphone', price: 200 }
console.log(phone);

// Пример 6 
// Как создать объект на основании переменных, 
// но сохранить под другими ключами
const bestPrice28 = 400;
const input = "Sony";
const tv = {brand: input, price: bestPrice28};
console.log(tv);

// Пример 7 - Метод внутри объекта
const dog = {
  name: "Paddington",
  age: 1,
  bark(){
    console.log("Bark-bark-bark");
  },
  fetchToy(){
    return "Toy"
  }
};
// вызов метода
dog.bark(); //  "Bark-bark-bark" - только выводит в консоль
const toy = dog.fetchToy(); // этот метод возвращает значение
console.log(toy); // Toy

// Мы можем получить массив ключей?
const lion = {name: "Alex", origin: "Africa", city: "New-York"};
const keys = Object.keys(lion);
console.log(keys); // [ 'name', 'origin', 'city' ]

// Как можем получить массив значений?
const values = Object.values(lion);
console.log(values);

// Как получить пары ключ-значение? [[key, value], [key, value]]
const arrPairs = Object.entries(lion);
console.log(arrPairs); 
// [ [ 'name', 'Alex' ], [ 'origin', 'Africa' ], [ 'city', 'New-York' ] ]

// Как проверить что в объекте есть определенный ключ?
// Есть ли ключ name внутри lion?
console.log("name" in lion); // true
const hasWeightKey = "weigth" in lion;
console.log(hasWeightKey); // false

// Цикл for in
const car = {brand: "Porshe", price: 25000, color: "green"};
for (const key in car){
  console.log(key + ":" + car[key]);
  // console.log(car[key]);
}