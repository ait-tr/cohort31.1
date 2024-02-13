// Функции и области видимости

let x = 10;

function increase(){
  x++; // side effect
  // let y = 10;
}

increase();
console.log(x); // 11
// console.log(y); // undefined