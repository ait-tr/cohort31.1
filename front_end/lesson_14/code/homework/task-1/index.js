// 1 способ: через цикл for
// const numbers = document.getElementsByClassName("number");

// console.log(numbers);
// for (let i = 0; i < numbers.length; i++) {
//   setTimeout(() => displayNum(numbers[i]), (i + 1) * 1000);
// }

// 2 способ: через метод forEach()
const numbers = document.querySelectorAll(".number"); // ищем элементы через querySelectorAll
console.log(numbers);

// Проходимся по каждому через цикл forEach() и вызываем ф-ю displayNum() для каждого жлемента
numbers.forEach((elem, index) => {
  setTimeout(() => {
    displayNum(elem);
  }, (index + 1) * 1000);
});

// создаем ф-ю displayNum
function displayNum(elem) {
  elem.style.visibility = "visible";
}
