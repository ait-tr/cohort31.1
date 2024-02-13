// let, const

let x = 9;
let str = "nine";
let z;
z = 10;

x = 10;

const y = 9;
// y = 10; // ошибка - нельзя присваивать новое значение константе
console.log(x); // 10
x = "nine";
console.log(x); // nine
let cat;
{
  cat = "murzik";
  console.log(x);
}
console.log(cat); // консоль в браузере