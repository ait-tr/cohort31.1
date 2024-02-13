console.log("Hello");

// let, const, var

// {
//   var x = 10;
// }
// console.log(x); // var виден во внешнем скопе в отличии от let, const

// ПРИМИТИВНЫЕ ТИПЫ 
// 1. string 
let myName = "John";
let str1 = "Можно писать в двойных";
let str2 = 'Можно писать в одинарных';
// для char нет отдельного типа
// Создаст копию, где все буквы прописные
let str3 = myName.toUpperCase(); // JOHN

// 2. number
let n1 = 10;    // могут быть целыми
let n2 = 10.5;  // могут буть с плавающей точкой

console.log(Number.MAX_SAFE_INTEGER); // 9007199254740991 2^53 − 1.

// 3. bigInt
let n3 = 128n; // пишется с постфиксом

// 4. boolean 
let isDrunk = true;
// условная конструкция if
if(isDrunk){
  console.log("охохо, мне море по колено, а горы по плечу");
}
// if-else такой же как в java 
// тернарный оператор 
let animal = isDrunk ? "pig" : "human";

// 5. Symbol - не будем использовать в рамках курса

const s1 = Symbol("something");
console.log(s1); // Symbol(something)

// 6. undefined
let u1;
console.log(u1); // undefined
// когда не присвоено значение переменной - то в ней лежит undefined
//(когда нет элемента в массиве по индексу, когда нет ключа в объекте)
// так же можем прописать вручную
let u2 = undefined;

// 7. null
// отсутвие значения
// можем прописать вручную:
let u3 = null;
// null возникает чаще всего - как возвращаемое значение от методов.
// document.getElementById("no-such-id") --> null
// например - если метод getElementById не нашел значение - возращает null

// ПРЕОБРАЗОВАНИЕ ТИПОВ
// 1. преобразование в строку 
// неявное implicit
let str4  = 9 + ""; // через конкатенацию
// явное explicit
let str5 = String(9); // "9"
let n6 = 128;
let str6 = String(n6); // "128"
// небольшой кейс на "подумать"
let str7 = 12 + 6 + "10"; // "1810"
let str8 = 12 + "6" + 10; // "12610"

// 2. преобразование в число
// неявным образом
const n7 = +"9";          // 8 число
const n8 = +"10" + +"15"; // 25 число
console.log(n8);
// явным
let n9 = Number("9"); 
console.log(typeof n9);
let res = typeof n9; // "number"
console.log(res);
// какая проблема?
let n10 = Number("9@7h"); // если не получается
console.log(n10); // NaN
// NaN - not a number 
// вопрос на засыпку? Какой тип у NaN?
console.log(typeof NaN); // "number"
console.log(typeof true);// "boolean"

// 3. Преобразовние в boolean - самое каверзное
// явное преобразование в булеан Boolean();
console.log(Boolean(12));   // true
console.log(Boolean(-12));  // true
console.log(Boolean(0));    // false
console.log(Boolean(NaN));  // false

console.log(Boolean("cat"));// true
console.log(Boolean(""));   // false

console.log(Boolean(null)); // false
console.log(Boolean(undefined)); // false

// falsy values: 0, null, undefined, NaN, ""	--> false

// неявные преобразования в булеан
const name1 = "Igor"; // поподставляйте разные значения и посмотрите, что выводится в консоль - привет или elseNaN, "NaN", 0, "0", 
if(name1){
  console.log("Привет, " + name1);
} else {
  console.log("Else");
}

// ОПЕРАТОРЫ
// 1. тернарный оператор
// 2. математические: *, -, /, +, %
// ** - возведение в степень
const sum = 10 + 12;
const power = 3 ** 2; // три в степени два
console.log(power);
// 3. операторы сравнения: >, <, >=, <= - булеан
// равенство - строгое === и нестрогое ==
// 
console.log(9 === 9); // true
console.log(9 == 9);  // true

console.log(9 === "9"); // false
console.log(9 == "9");  // true
// строгое === смотрит тип и, если он не совпадает - сразу false
// не строгое == если отличаются - происходит неявное преобразование типов 
// - и уже сравниваются значения
// строка число булеан
// Разбор сложных случаев
console.log(true == ''); // false
let res2 = Number(true); // 
console.log(res2); // 1
console.log(String(true)); // "true"
console.log(Number(true)); // 1
console.log(true == "1");  //  строка <- число <-булеан
console.log(String(Number(true))); // true -> 1 -> "1"
// если сравниваем булеан и стринг - преобразовываться будет к стрингу, но сначала через число

// Неравенство 
console.log(9 !== 10); // true // используем вот этот вариант
// console.log(9 != "9"); // нестрогое существует, но не сможет вам навредить

// Присиваивания 
// =
let n11 = 10;